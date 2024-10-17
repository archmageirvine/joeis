package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A048680 Nonnegative integers A001477 expanded with rewrite 0-&gt;0, 01-&gt;1, then interpreted as Zeckendorffian expansions (as numbers of Fibonacci number system).
 * @author Sean A. Irvine
 */
public class A048680 extends Sequence0 implements DirectSequence {

  // After Charles R Greathouse IV

  private long mN = -1;

  @Override
  public Z a(Z n) {
    int k = 2;
    Z s = Z.ZERO;
    while (!n.isZero()) {
      if (n.testBit(0)) {
        final long m = k++;
        s = s.add(Functions.FIBONACCI.z(m));
      }
      ++k;
      n = n.divide2();
    }
    return s;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
