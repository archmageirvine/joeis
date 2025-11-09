package irvine.oeis.a081;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081739 a(n) = (-1/2^n)*(A000367(2^n)+1).
 * @author Sean A. Irvine
 */
public class A081739 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = 1;

  @Override
  public Z next() {
    return mB.get(1L << ++mN).num().add(1).abs().shiftRight(mN - 1);
  }
}
