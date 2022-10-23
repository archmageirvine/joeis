package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068849 a(1) = 41 ( the smallest prime beginning with 4) and then the smallest prime with leading digits containing a(n-1).
 * @author Georg Fischer
 */
public class A068849 extends Sequence1 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A068849() {
    this(41);
  }

  /**
   * Generic constructor with parameters
   * @param start first term
   */
  public A068849(final int start) {
    mN = 0;
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA;
    }
    Z pow10 = Z.ONE;
    while (true) {
      pow10 = pow10.multiply(10);
      final Z limit = mA.multiply(pow10).add(pow10);
      Z cand = mA.multiply(pow10).add(1);
//  System.out.println("pow10=" + pow10 + ", limit=" + limit + ", cand=" + cand + ", mA=" + mA);
      while (cand.compareTo(limit) < 0) {
        if (cand.isProbablePrime()) {
          mA = cand;
          return mA;
        }
        cand = cand.add(2);
      }
    }
  }
}
