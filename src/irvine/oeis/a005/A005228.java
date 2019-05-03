package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A005228 Sequence and first differences <code>(A030124)</code> together list all positive numbers exactly once.
 * @author Sean A. Irvine
 */
public class A005228 implements Sequence {

  private Z mA = null;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
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
