package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064895 Binary concentration of n. Replace 2^e_k with 2^(e_k/g(n)) in binary expansion of n, where g(n) = GCD of exponents e_k = A064894(n).
 * @author Sean A. Irvine
 */
public class A064895 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.valueOf(mN);
    }
    long m = mN;
    long gcd = 0;
    long k = -1;
    while (m != 0) {
      ++k;
      if ((m & 1) == 1) {
        gcd = Functions.GCD.l(gcd, k);
      }
      m >>>= 1;
    }
    m = mN;
    k = -1;
    long sum = 0;
    while (m != 0) {
      ++k;
      if ((m & 1) == 1) {
        sum += 1L << (k / gcd);
      }
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}

