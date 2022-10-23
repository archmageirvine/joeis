package irvine.oeis.a301;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A301990 a(n) = 8*(n-1)*a(n-1) + Product_{k=0..n-2} (2*k-1) with a(1) = 1.
 * @author Georg Fischer
 */
public class A301990 extends Sequence1 {

  private int mN;
  private Z mA;
  private Z mProd;

  /** Construct the sequence. */
  public A301990() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mProd = Z.ONE;
      mA = Z.ONE;
      return mA;
    }
    mProd = mProd.multiply(2L * mN - 5);
    mA = mA.multiply(8L * (mN - 1)).add(mProd);
    return mA;
  }
}
