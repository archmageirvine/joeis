package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-06-22.ack/arrlamb at 2025-06-22 22:11

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A369291 Array read by antidiagonals: T(n,k) = phi(k^n-1)/n, where phi is Euler's totient function (A000010), n &gt;= 1, k &gt;= 2.
 * @author Georg Fischer
 */
public class A369291 extends LambdaArray {

  /** Construct the sequence. */
  public A369291() {
    super(1, 1, 1, -1, (n, k) -> n == 1 && k == 1 ? Z.ONE : Functions.PHI.z(Z.valueOf(k + 1).pow(n).subtract(1)).divide(n));
  }
}
