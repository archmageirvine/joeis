package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064894 Binary dilution of n. GCD of exponents in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A064894 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long gcd = 0;
    long k = -1;
    while (m != 0) {
      ++k;
      if ((m & 1) == 1) {
        gcd = Functions.GCD.l(gcd, k);
      }
      m >>>= 1;
    }
    return Z.valueOf(gcd);
  }
}

