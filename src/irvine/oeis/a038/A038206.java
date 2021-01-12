package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038206 Can express a(n) with the digits of a(n)^2 in order, only adding plus signs.
 * @author Sean A. Irvine
 */
public class A038206 implements Sequence {

  private long mAdd = 1; // We want == 0,1 (mod 9)
  private long mN = -8;

  protected boolean is(final Z n, final String s, final Z sum) {
    if (s.isEmpty()) {
      return sum.equals(n);
    }
    if (sum.compareTo(n) > 0) {
      return false; // sum already exceeds target
    }
    // Try taking the rest as it
    if (is(n, "", sum.add(new Z(s)))) {
      return true;
    }
    // Try + in each possible position
    for (int k = 1; k < s.length(); ++k) {
      if (is(n, s.substring(k), sum.add(new Z(s.substring(0, k))))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mAdd = 9 - mAdd;
      mN += mAdd;
      final Z n = Z.valueOf(mN);
      if (is(n, n.square().toString(), Z.ZERO)) {
        return n;
      }
    }
  }
}
