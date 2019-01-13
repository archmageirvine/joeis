package irvine.oeis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.factor.prime.Fast;
import irvine.math.MutableInteger;

/**
 * Compute A065843 through A065851.
 *
 * @author Sean A. Irvine
 */
public final class A065851 {

  private A065851() { }

  static void dumpRecord(final HashMap<String, MutableInteger> m, final int base) {
    int best = 0;
    for (final MutableInteger mv : m.values()) {
      final int v = mv.get();
      if (v > best) {
        best = v;
      }
    }
    System.out.println("A0" + (65841 + base) + " " + best);
    System.out.flush();
  }

  private static void increment(final Map<String, MutableInteger> m, final String s) {
    final MutableInteger c = m.get(s);
    if (c == null) {
      m.put(s, new MutableInteger(1));
    } else {
      c.postIncrement();
    }
  }

  static void search() {
    final int[] space = new int[11];
    final long[] cutOff = new long[11];
    final ArrayList<HashMap<String, MutableInteger>> map = new ArrayList<>(cutOff.length);
    for (int k = 2; k < cutOff.length; ++k) {
      cutOff[k] = k;
      map.add(new HashMap<>());
    }
    final Fast prime = new Fast();
    long p = 1;
    while (true) {
      p = prime.nextPrime(p);
      for (int k = 2; k < cutOff.length; ++k) {
        if (p >= cutOff[k]) {
          dumpRecord(map.get(k), k);
          cutOff[k] *= (long) k;
          map.get(k).clear();
        }
      }
      for (int k = 2; k <= 10; ++k) {
        Arrays.fill(space, 0);
        long h = p;
        while (h != 0) {
          space[(int) (h % k)]++;
          h /= (long) k;
        }
        increment(map.get(k), Arrays.toString(space));
      }
    }
  }

  /**
   * Search.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    search();
  }
}

