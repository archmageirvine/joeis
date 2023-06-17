package irvine.oeis.a039;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A039987 k th digit of a(n) = number of different digits within 2 places of k (not including k).
 * @author Sean A. Irvine
 */
public class A039987 extends AbstractSequence {

  /** Construct the sequence. */
  public A039987() {
    super(0);
  }

  private final TreeSet<String> mA = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(o -> o));

  {
    for (int k = 1; k <= shift(); ++k) {
      mA.add(String.valueOf(k));
    }
  }

  protected int shift() {
    return 2;
  }

  private boolean isOk(final String s) {
    for (int k = 0; k < s.length(); ++k) {
      int pop = 0;
      for (int j = k - shift(); j <= k + shift(); ++j) {
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
      mA.add(s + "3");
      if (isOk(s)) {
        return new Z(s);
      }
    }
  }
}

