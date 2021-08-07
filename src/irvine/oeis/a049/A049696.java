package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A049696 a(n)=T(n,n), array T as in A049695.
 * @author Sean A. Irvine
 */
public class A049696 extends A002088 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
