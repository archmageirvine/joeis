package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073461 Largest solution to phi(x) - pi(x) = n or 0 if no such solution exists.
 * @author Sean A. Irvine
 */
public class A073461 extends AbstractSequence {

  /** Construct the sequence. */
  public A073461() {
    super(-2);
  }

  private static final CR C = CR.GAMMA.exp();
  private final LongDynamicLongArray mLasts = new LongDynamicLongArray();
  private final Sequence mPrimePi = new A000720();
  private long mN = -3;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mN < 0) {
      return mN == -2 ? Z.valueOf(30) : Z.valueOf(60);
    }
    while (true) {
      ++mM;
      final long pi = mPrimePi.next().longValueExact();
      final long t = Functions.PHI.l(mM) - pi;
      if (t >= 0) {
        mLasts.set(t, mM);
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
    return Z.valueOf(mLasts.get(mN));
  }
}
