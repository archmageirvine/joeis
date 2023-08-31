package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065368 Alternating sum of ternary digits in n. Replace 3^k with (-1)^k in ternary expansion of n.
 * @author Sean A. Irvine
 */
public class A065368 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    long m = 1;
    while (n > 0) {
      s += m * (n % 3);
      n /= 3;
      m = -m;
    }
    return Z.valueOf(s);
  }
}
