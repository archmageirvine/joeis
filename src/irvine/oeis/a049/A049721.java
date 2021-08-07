package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a048.A048149;

/**
 * A049721 a(n)=T(n,2), array T as in A048149.
 * @author Sean A. Irvine
 */
public class A049721 extends A048149 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 2L);
  }
}
