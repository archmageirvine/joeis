package irvine.oeis.a291;
// manually 2022-12-26

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a064.A064415;

/**
 * A291783 Partial sums of A064415(k)^2.
 * @author Georg Fischer
 */
public class A291783 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private final A064415 mSeq = new A064415();

  {
    next();
  }

  @Override
  public Z next() {
    final Z result = mSum;
    mSum = mSum.add(mSeq.next().square());
    return result;
  }
}
