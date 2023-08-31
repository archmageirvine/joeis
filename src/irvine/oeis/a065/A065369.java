package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065369 Replace 3^k with (-3)^k in ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A065369 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    long m = 1;
    while (n > 0) {
      s += m * (n % 3);
      n /= 3;
      m *= -3;
    }
    return Z.valueOf(s);
  }
}
