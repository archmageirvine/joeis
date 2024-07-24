package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002379;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071532 extends Sequence1 {

  private final Sequence mSeq = new A002379().skip();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.subtract(Z.NEG_ONE.pow(mSeq.next()));
    return mSum;
  }
}
