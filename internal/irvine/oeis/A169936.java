package irvine.oeis;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import irvine.util.string.English;

/**
 * A169936.
 * @author Sean A. Irvine
 */
public final class A169936 {

  private A169936() { }

  private static void findThem(final int limit) {
    final HashMap<String, ArrayList<Integer>> cache = new HashMap<>();
    for (int k = 0; k < limit; ++k) {
      final byte[] s = English.toRawEnglish(k).getBytes(StandardCharsets.US_ASCII);
      Arrays.sort(s);
      final String q = new String(s, StandardCharsets.US_ASCII);
      final ArrayList<Integer> b = cache.get(q);
      if (b == null) {
        final ArrayList<Integer> al = new ArrayList<>();
        al.add(k);
        cache.put(q, al);
      } else {
        b.add(k);
      }
    }
    final boolean[] seen = new boolean[limit];
    for (final ArrayList<Integer> l : cache.values()) {
      if (l.size() > 1) {
        for (final Integer i : l) {
          seen[i] = true;
        }
      }
    }
    for (int k = 0; k < limit; ++k) {
      if (seen[k]) {
        System.out.println(k);
      }
    }
  }

  /**
   * Play.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    findThem(1000000);
  }
}

