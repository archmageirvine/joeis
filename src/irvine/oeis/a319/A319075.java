package irvine.oeis.a319;
// manually 2026-08-19/arrlamb at 2026-08-19 16: 08

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaArray;

/**
 * A319075 Square array T(n,k) read by antidiagonal upwards in which row n lists the n-th powers of primes, hence column k lists the powers of the k-th prime, n &gt;= 0, k &gt;= 1.
 * @author Georg Fischer
 */
public class A319075 extends LambdaArray {

  /** Construct the sequence. */
  public A319075() {
    super(0, 0, 1, 1, (n, k) -> Functions.PRIME.z(k).pow(n));
    next();
  }
}
