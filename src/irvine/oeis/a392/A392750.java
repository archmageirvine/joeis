package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a381.A381466;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A392750 Positive integers that appear in A381466.
 * @author Sean A. Irvine
 */
public class A392750 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final Sequence mS = new A381466();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM <= 6 * mN * mN - 2 * mN) {
        ++mM;
        mSeen.set(mS.next().longValueExact());
      }
      if (mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

