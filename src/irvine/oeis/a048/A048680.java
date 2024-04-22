package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048680 Nonnegative integers A001477 expanded with rewrite 0-&gt;0, 01-&gt;1, then interpreted as Zeckendorffian expansions (as numbers of Fibonacci number system).
 * @author Sean A. Irvine
 */
public class A048680 extends Sequence0 {

  // After Charles R Greathouse IV

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    int k = 2;
    Z s = Z.ZERO;
    while (m != 0) {
      if ((m & 1) == 1) {
        final long n = k++;
        s = s.add(Functions.FIBONACCI.z(n));
      }
      ++k;
      m >>>= 1;
    }
    return s;
  }
}
