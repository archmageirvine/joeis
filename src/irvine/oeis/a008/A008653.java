package irvine.oeis.a008;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008653 Theta series of direct sum of 2 copies of hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A008653 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Jaguar.factor(3 * mN).sigma().subtract(Jaguar.factor(mN).sigma().multiply(3)).multiply(12);
  }
}
