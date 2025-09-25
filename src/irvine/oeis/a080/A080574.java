package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A080574 a(1)=1, a(n)=a(n-1)+1 if n is odd and already in the sequence, a(n)=a(n-1)+2 if n is even and already in the sequence, a(n)=a(n-1)+3 otherwise.
 * @author Sean A. Irvine
 */
public class A080574 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mA = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      if ((mN & 1) == 1 && mSeen.isSet(mN)) {
        mA += 1;
      } else if ((mN & 1) == 0 && mSeen.isSet(mN)) {
        mA += 2;
      } else {
        mA += 3;
      }
    }
    mSeen.set(mA);
    return Z.valueOf(mA);
  }
}

