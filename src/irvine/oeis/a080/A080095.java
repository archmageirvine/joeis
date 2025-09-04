package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080095 Let sum(k&gt;=0, k^n/(2*k+1)!) = (x(n)*e + y(n)/e)/z(n), where x(n) and z(n) are &gt;0, then a(n)=z(n).
 * @author Sean A. Irvine
 */
public class A080095 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN % 3 == 1 ? mN : mN + 1);
  }
}
