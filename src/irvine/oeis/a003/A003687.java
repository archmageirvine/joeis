package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003687 <code>a(n+1) = a(n)-a(1)a(2)...a(n-1),</code> if <code>n&gt;0. a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A003687 implements Sequence {

  private Z mProd = null;
  private Z mA = null;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
      return Z.ONE;
    }
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA.subtract(mProd);
    mProd = mProd.multiply(mA);
    mA = t;
    return mA;
  }
}
