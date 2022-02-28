package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a001.A001187;

/**
 * A054940 Number of connected labeled graphs with n nodes and an odd number of edges.
 * @author Sean A. Irvine
 */
public class A054940 extends A001187 {

  private final Sequence mF = new A000142();
  private boolean mEven = true;
  {
    super.next();
  }

  @Override
  public Z next() {
    mEven = !mEven;
    return super.next().signedAdd(mEven, mF.next()).divide2();
  }
}
