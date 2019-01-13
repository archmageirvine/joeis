package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;
import irvine.oeis.Sequence;

/**
 * A007629.
 * @author Sean A. Irvine
 */
public class A007629 implements Sequence {

  private Z mN = Z.TEN;
  // Members so we can reuse the space
  private long[] mCoeffs = new long[0];
  private long[] mTaps = new long[0];

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String n = mN.toString();
      if (n.length() > mCoeffs.length) {
        mCoeffs = new long[n.length()];
        mTaps = new long[n.length()];
        Arrays.fill(mTaps, 1);
      }
      for (int k = 0; k < mCoeffs.length; ++k) {
        mCoeffs[k] = n.charAt(k) - '0';
      }
      final Sequence seq = new LinearRecurrence(mTaps, mCoeffs);
      Z t;
      do {
        t = seq.next();
      } while (t.compareTo(mN) < 0);
      if (t.equals(mN)) {
        return mN;
      }
    }
  }
}
