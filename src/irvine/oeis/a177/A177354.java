package irvine.oeis.a177;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A177354 a(n) is the moment of order n for the density measure 24*x^4*exp(-x)/( (x^4*exp(-x)*Ei(x) - x^3 - x^2 - 2*x - 6)^2 + Pi^2*x^8*exp(-2*x) ) over the interval 0..infinity.
 * @author Georg Fischer
 */
public class A177354 extends MemorySequence {

  /* a(n) = (1/24)*( (n+6)! - 5*(n+5)! - Sum_{i=0..n-1} (n+4-i)!*a(i) ). */
  @Override
  public Z computeNext() {
    final int n = size();
    Z sum = MemoryFactorial.SINGLETON.factorial(n + 6).subtract(MemoryFactorial.SINGLETON.factorial(n + 5).multiply(5));
    for (int i = 0; i < n; ++i) {
      sum = sum.subtract(MemoryFactorial.SINGLETON.factorial(n + 4 - i).multiply(a(i)));
    }
    return sum.divide(24);
  }
}
