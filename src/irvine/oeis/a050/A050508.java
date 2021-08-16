package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a007.A007067;

/**
 * A050508 Golden rectangle numbers: n * A007067(n).
 * @author Sean A. Irvine
 */
public class A050508 extends A007067 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
