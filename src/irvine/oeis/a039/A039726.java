package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A039726 Recursive prime generating sequence.
 * @author Sean A. Irvine
 */
public class A039726 extends A000040 {

  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z a = mProd.multiply(p);
      if (a.add(1).isProbablePrime()) {
        mProd = a;
        return p;
      }
    }
  }
}
