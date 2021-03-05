package irvine.oeis.a039;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039988 k th digit of a(n) is the number of different digits within 1 of k (not including k).
 * @author Sean A. Irvine
 */
public class A039988 implements Sequence {

  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(o -> o));
  {
    mA.add("1");
  }

  private boolean isOk(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      int pop = 0;
      for (int j = k - 1; j <= k + 1; ++j) {
        if (j != k && j >= 0 && j < s.length()) {
          pop |= 1 << (s.charAt(j) - '0');
        }
      }
      if (Integer.bitCount(pop) != s.charAt(k) - '0') {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final String s = mA.pollFirst();
      mA.add(s + "1");
      mA.add(s + "2");
      if (isOk(s)) {
        return new Z(s);
      }
    }
  }
}

