package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a005.A005439;

/**
 * A000366 Genocchi numbers of second kind (A005439) divided by 2^(n-1).
 * @author Sean A. Irvine
 */
public class A000366 extends A005439 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().shiftRight(mN - 1);
  }
}
