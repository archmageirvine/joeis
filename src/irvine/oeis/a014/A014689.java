package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014689 <code>a(n) =</code> prime(n)-n, the number of nonprimes less than prime(n).
 * @author Sean A. Irvine
 */
public class A014689 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
