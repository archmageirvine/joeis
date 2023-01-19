package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060999;

/**
 * A061001 Partial sums of the squares of the terms of A060999.
 * @author Sean A. Irvine
 */
public class A061001 extends Sequence1 {

  private final Sequence mA = new A060999();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(mA.next().square());
    return mSum;
  }
}
