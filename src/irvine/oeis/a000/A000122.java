package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000122 Expansion of Jacobi theta function <code>theta_3(x) = Sum_{m =-inf..inf} x^(m^2)</code> (number of integer solutions to <code>k^2 = n)</code>.
 * @author Sean A. Irvine
 */
public class A000122 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(Z.ZERO)) {
      return Z.ONE;
    }
    if (mN.sqrtAndRemainder()[1].equals(Z.ZERO)) {
      return Z.TWO;
    }
    return Z.ZERO;
  }
}

