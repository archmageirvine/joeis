package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001764;

/**
 * A047754 Number of dissectable polyhedra with n tetrahedral cells and symmetry of type H.
 * @author Sean A. Irvine
 */
public class A047754 extends Sequence1 {

  private final A001764 mSeq = new A001764();
  private final A047751 mA = new A047751();
  private final A047753 mB = new A047753();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA.next().add(mB.next());
    if ((++mN & 3) != 1) {
      return Z.ZERO;
    } else {
      return mSeq.next().subtract(t).divide2();
    }
  }
}

