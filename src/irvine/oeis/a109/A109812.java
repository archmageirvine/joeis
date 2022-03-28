package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A109812 a(1)=1; thereafter a(n) = smallest positive integer not among the earlier terms of the sequence such that a(n) and a(n-1) have no common 1-bits in their binary representations.
 * @author Sean A. Irvine
 */
public class A109812 implements Sequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mA = 0;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
    } else {
      long k = 1;
      while ((mA & ++k) != 0 || mSeen.isSet(k)) {
        // do nothing
      }
      mA = k;
    }
    mSeen.set(mA);
    return Z.valueOf(mA);
  }
}
