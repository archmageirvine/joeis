package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073451.
 * @author Sean A. Irvine
 */
public class A073462 extends AbstractSequence {

  /** Construct the sequence. */
  public A073462() {
    super(-1);
  }

  private static final CR C = CR.GAMMA.exp();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private final Sequence mPrimePi = new A000720();
  private long mN = -2;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.SIX;
    }
    while (true) {
      ++mM;
      final long pi = mPrimePi.next().longValueExact();
      final long t = Functions.PHI.l(mM) - pi;
      if (t >= 0) {
        mCounts.increment(t);
      }
      if (mM % 1000 == 999) {
        // Don't do this check every iteration
        final CR x = CR.valueOf(mM);
        final CR v = x.divide(x.log().log().multiply(C).add(2)).subtract(pi);
        if (v.floor().longValueExact() > mN) {
          break;
        }
      }
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
