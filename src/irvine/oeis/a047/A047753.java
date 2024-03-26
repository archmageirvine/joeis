package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047753 Number of dissectable polyhedra with n tetrahedral cells and symmetry of type I.
 * @author Sean A. Irvine
 */
public class A047753 extends A047749 {

  private final Sequence mA = new A047751();
  private long mN = 0;

  @Override
  public Z next() {
    final Z a = mA.next();
    if ((++mN & 3) != 1) {
      return Z.ZERO;
    } else {
      return super.next().subtract(a);
    }
  }
}

