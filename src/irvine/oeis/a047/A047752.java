package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001764;

/**
 * A047752 Number of chiral pairs of dissectable polyhedra with n tetrahedral cells and symmetry of type J.
 * @author Sean A. Irvine
 */
public class A047752 extends A047749 {

  /** Construct the sequence. */
  public A047752() {
    super(1);
  }

  private final Sequence mA = new A001764();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 12 != 5) {
      return Z.ZERO;
    } else {
      return mA.next().subtract(super.next()).divide2();
    }
  }
}

