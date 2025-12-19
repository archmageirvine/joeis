package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001359;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A082674 Constant term when a polynomial of degree n is fitted to the lower members of the first n+1 twin prime pairs.
 * @author Sean A. Irvine
 */
public class A082674 extends Sequence1 {

  private final Sequence mA = new InverseBinomialTransformSequence(1, new A001359(), 0);
  private Z mSum = Z.ZERO;
  private long mSign = -1;
  {
    skip();
  }

  @Override
  public Z next() {
    mSign = -mSign;
    mSum = mSum.add(mA.next().multiply(mSign));
    return mSum;
  }
}
