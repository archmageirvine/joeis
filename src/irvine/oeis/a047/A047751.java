package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047751 Number of dissectable polyhedra with symmetry of type K.
 * @author Sean A. Irvine
 */
public class A047751 extends A047749 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN % 12 != 5) {
      return Z.ZERO;
    } else {
      return super.next();
    }
  }
}

