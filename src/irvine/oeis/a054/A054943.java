package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000831;

/**
 * A054943 Number of connected oriented graphs on n nodes with an odd number of edges.
 * @author Sean A. Irvine
 */
public class A054943 extends A054941 {

  private final Sequence mF = new A000831();
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    return super.next().signedAdd(mEven, mF.next()).divide2();
  }
}
