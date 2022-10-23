package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004068 Number of atoms in a decahedron with n shells.
 * @author Sean A. Irvine
 */
public class A004068 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.square().multiply(5).add(1).multiply(n).divide(6);
  }
}
