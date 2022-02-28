package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000831;

/**
 * A054942 Number of connected oriented graphs on n nodes with an even number of edges.
 * @author Sean A. Irvine
 */
public class A054942 extends A054941 {

  private final Sequence mF = new A000831();
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    return super.next().signedAdd(mEven, mF.next()).divide2();
  }
}
