package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A005445 From a Fibonacci-like differential equation.
 * @author Sean A. Irvine
 */
public class A005445 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final A000045 fibonacci = new A000045();
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(k).multiply(fibonacci.next()).multiply(Functions.STIRLING1.z(mN, k)));
    }
    return sum;
  }
}

