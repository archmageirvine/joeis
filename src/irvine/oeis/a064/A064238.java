package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a046.A046025;

/**
 * A064238 Values of m such that N=(am+1)(bm+1)(cm+1) is a 3-Carmichael number (A087788), where a,b,c = 1,2,3.
 * @author Sean A. Irvine
 */
public class A064238 extends A046025 {

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
