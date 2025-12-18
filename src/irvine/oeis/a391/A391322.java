package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A391322 allocated for Enrique Navarrete.
 * @author Sean A. Irvine
 */
public class A391322 extends AbstractSequence {

  private final long mStart;
  private final int mNumFactors;
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = -1;
  private long mLeastUnused = 2;

  protected A391322(final int offset, final long start, final int numFactors) {
    super(offset);
    mStart = start;
    mNumFactors = numFactors;
  }

  /** Construct the sequence. */
  public A391322() {
    this(1, 8, 3);
  }

  private boolean is(final FactorSequence r, final FactorSequence s) {
    int cnt = 0;
    for (final Z p : r.toZArray()) {
      cnt += Math.min(r.getExponent(p), s.getExponent(p));
      if (cnt >= mNumFactors) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA == -1) {
      mA = mStart;
    } else if (mA == 0) {
      mA = 4; // For A251756
    } else {
      final FactorSequence fs = Jaguar.factor(mA);
      while (mUsed.isSet(mLeastUnused)) {
        ++mLeastUnused;
      }
      long k = mLeastUnused;
      while (true) {
        if (!mUsed.isSet(k)) {
          final FactorSequence fsk = Jaguar.factor(k);
          if (fsk.bigOmega() < mNumFactors) {
            mUsed.set(k);
          } else if (is(fsk, fs)) {
            mA = k;
            break;
          }
        }
        ++k;
      }
    }
    mUsed.set(mA);
    return Z.valueOf(mA);
  }
}
