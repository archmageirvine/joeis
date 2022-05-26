package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057194 a(1) = 1; a(n+1) = (Product_{k=1..n} a(k)) * Sum_{k=1..n} a(k).
 * @author Sean A. Irvine
 */
public class A057194 implements Sequence {

  private Z mA = null;
  private Z mSum = Z.ZERO;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mSum = mSum.add(mA);
      mProd = mProd.multiply(mA);
      mA = mSum.multiply(mProd);
    }
    return mA;
  }
}
