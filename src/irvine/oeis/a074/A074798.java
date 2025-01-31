package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074798 Floor of S*n^2, where S equals sum of reciprocal terms of this same sequence.
 * @author Sean A. Irvine
 */
public class A074798 extends Sequence1 {

  private static final CR S = CR.valueOf(new Q(new Z("1471869231468455847281"), new Z("1000000000000000000000")));
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 0) {
      // int only has 10 digits, so well below limit for use of Einstein's value
      throw new UnsupportedOperationException();
    }
    return S.multiply((long) mN * mN).floor();
  }

  // Based on Hanna, private communication.
  // The following (very) slowly converges on the value given by David Einstein

//  private CR mS = CR.PI.square().divide(6);
//  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
//
//  @Override
//  public Z next() {
//    ++mN;
//    Z t = Z.ZERO;
//    final long m = mN + 10;
//    final int precision = -(mN + 1) * (mN + 1);
//    for (long k = 1; k < 4 * m * m; ++k) { // Hanna estimates mN ~ c*sqrt(m/s)
//      t = t.add(CR.valueOf(mS.multiply(k * k).floor()).inverse().getApprox(precision));
//    }
//    mS = CR.valueOf(new Q(t, Z.ONE.shiftLeft(-precision)));
//    if (mVerbose) {
//      StringUtils.message(mN + " revised S=" + mS.toString(50));
//    }
//    return mS.multiply((long) mN * mN).floor();
//  }
}
