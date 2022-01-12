package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000031;

/**
 * A053656 Number of cyclic graphs with oriented edges on n nodes (up to symmetry of dihedral group).
 * @author Sean A. Irvine
 */
public class A053656 extends A000031 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return ((mN & 1) == 0 ? t.add(Z.ONE.shiftLeft(mN / 2 - 1)) : t).divide2();
  }
}
