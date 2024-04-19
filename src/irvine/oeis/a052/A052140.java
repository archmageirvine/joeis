package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052140 4^n*n!^2*Sum_{k=0..n} 1/k!.
 * @author Sean A. Irvine
 */
public class A052140 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN;
    final Z nf = Functions.FACTORIAL.z(n);
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(nf.divide(Functions.FACTORIAL.z(k)));
    }
    return sum.multiply(nf).shiftLeft(2L * mN);
  }
}

