package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008658 Theta series of direct sum of 2 copies of D_4 lattice in powers of q^2.
 * @author Sean A. Irvine
 */
public class A008658 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Jaguar.factor(mN).sigma(3).add((mN & 1) == 0 ? Jaguar.factor(mN / 2).sigma(3).multiply(4) : Z.ZERO).multiply(48);
  }
}
