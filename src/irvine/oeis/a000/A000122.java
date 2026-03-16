package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000122 Expansion of Jacobi theta function theta_3(x) = Sum_{m =-oo..oo} x^(m^2) (number of integer solutions to k^2 = n).
 * @author Sean A. Irvine
 */
public class A000122 extends Sequence0 implements DirectSequence {

  private long mN = -1L;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ONE : (n.sqrtAndRemainder()[1].isZero() ? Z.TWO : Z.ZERO);
  }

  @Override
  public Z a(final long n) {
    return n == 0L ? Z.ONE : (Z.valueOf(n).sqrtAndRemainder()[1].isZero() ? Z.TWO : Z.ZERO);
  }

}

