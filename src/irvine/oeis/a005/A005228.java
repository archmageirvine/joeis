package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A005228 Sequence and first differences (A030124) together list all positive numbers exactly once.
 * @author Sean A. Irvine
 */
public class A005228 extends AbstractSequence {

  /** Construct the sequence. */
  public A005228() {
    super(1);
  }

  private Z mA = null;
  protected final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mC = 1;

  private long nextComplement() {
    while (mSeen.isSet(++mC)) {
      // do nothing
    }
    return mC;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(nextComplement());
    mSeen.set(mA.longValueExact());
    return mA;
  }
}
