package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a007.A007373;

/**
 * A055574 n satisfying sigma(n+1) = sigma(n-1).
 * @author Sean A. Irvine
 */
public class A055574 extends A007373 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
