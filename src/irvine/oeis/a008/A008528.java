package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008528 Coordination sequence for 4-dimensional RR-centered di-isohexagonal orthogonal lattice.
 * @author Sean A. Irvine
 */
public class A008528 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).multiply(mN).multiply(11).add(7).multiply(mN);
  }
}
