package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008528 Coordination sequence for <code>4-dimensional RR-centered di-isohexagonal</code> orthogonal lattice.
 * @author Sean A. Irvine
 */
public class A008528 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).multiply(mN).multiply(11).add(7).multiply(mN);
  }
}
