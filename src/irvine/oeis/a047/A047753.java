package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047753 Number of dissectable polyhedra with n tetrahedral cells and symmetry of type I.
 * @author Sean A. Irvine
 */
public class A047753 extends Sequence1 {

  private final A047749 mSeq = new A047749();
  private final A047751 mA = new A047751();
  private long mN = 0;

  @Override
  public Z next() {
    final Z a = mA.next();
    if ((++mN & 3) != 1) {
      return Z.ZERO;
    } else {
      return mSeq.next().subtract(a);
    }
  }
}

