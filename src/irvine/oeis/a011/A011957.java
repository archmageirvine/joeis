package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000048;
import irvine.oeis.a001.A001037;
import irvine.oeis.a165.A165920;

/**
 * A011957 Number of ZnS polytypes that repeat after n layers.
 * @author Sean A. Irvine
 */
public class A011957 extends A001037 {

  // After Joerg Arndt

  private final A000048 mA48 = new A000048();
  private final A165920 mA165920 = new A165920();
  private long mN = 0;
  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      super.next(); // discard
      mA48.next(); // discard
      return Z.valueOf(mN - 1);
    }
    Z res = super.next();
    if ((mN & 1) == 0) {
      res = res.add(mA48.next().multiply(3));
    }
    if (mN % 3 == 0) {
      res = res.add(mA165920.next().multiply(4));
    }
    return res.divide(6);
  }
}
