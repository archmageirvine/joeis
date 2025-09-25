package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A080601.
 * @author Sean A. Irvine
 */
public class A080634 extends Sequence1 {

  // todo issue with tie-breaking ???

  private final LongDynamicBooleanArray mS = new LongDynamicBooleanArray(); // set bits for S2
  private long mN = 0;
  private long mS1Length = 0;
  private long mS2Length = 0;

  private long getProgressionLength(final boolean side, final long n) {
    long best = 1;
    for (long k = n - 1; k > 0; --k) {
      if (mS.isSet(k) == side) {
        final long d = n - k;
        long cnt = 2;
        long j = k - d;
        while (j > 0 && mS.isSet(j) == side) {
          ++cnt;
          j -= d;
        }
        if (cnt > best) {
          best = cnt;
        }
      }
    }
    return best;
  }

  private String getS(final boolean side, final long n) {
    final StringBuilder sb = new StringBuilder("{");
    for (int k = 1; k <= n; ++k) {
      if (mS.isSet(k) == side) {
        sb.append(k).append(",");
      }
    }
    return sb.append("}").toString();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long len1 = Math.max(mS1Length, getProgressionLength(false, mN));
    final long len2 = Math.max(mS2Length, getProgressionLength(true, mN));
    System.out.println(mN + " L1=" + mS1Length + " L2=" + mS2Length + " len1=" + len1 + " len2=" + len2 + " S1=" + getS(false, mN - 1) + " S2=" + getS(true, mN - 1));
//    for (int k = 1; k < 6; ++k) {
//      System.out.println(k + " " + mS.isSet(k));
//    }
    if (len2 > len1 || (len2 == len1 && mS1Length < mS2Length)) {
    //if (len2 > len1) {
      //if (len2 + mS1Length >= len1 + mS2Length) {
      mS1Length = len1;
      return Z.ONE;
    } else {
      mS2Length = len2;
      mS.set(mN);
      return Z.TWO;
    }
  }
}
