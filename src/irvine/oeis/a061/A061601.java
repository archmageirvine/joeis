package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A061601 9's complement of n: a(n) = 10^d - 1 - n where d is the number of digits in n. If a is a digit in n replace it with 9 - a.
 * @author Sean A. Irvine
 */
public class A061601 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    final String s = n.toString();
    Z r = Z.ZERO;
    for (int k = 0; k < s.length(); ++k) {
      r = r.multiply(10).add('9' - s.charAt(k));
    }
    return r;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}

