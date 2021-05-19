package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047764 Number of dissectable polyhedra with symmetry of type Q.
 * @author Sean A. Irvine
 */
public class A047764 extends A047749 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN % 6) != 2 ? Z.ZERO : super.next();
  }
}

