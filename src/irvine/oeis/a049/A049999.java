package irvine.oeis.a049;

import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;

/**
 * A049999 a(n) = smallest index k such that Fibonacci(k) = d(n), where d = A049998 (sequence of first differences of ordered products of Fibonacci numbers, i.e., of A049997, with no duplicates).
 * @author Sean A. Irvine
 */
public class A049999 extends A049998 {

  @Override
  public Z next() {
    return Z.valueOf(Fibonacci.inverseFibonacci(super.next()));
  }
}

