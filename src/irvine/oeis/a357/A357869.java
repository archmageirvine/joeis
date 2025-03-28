package irvine.oeis.a357;
// Generated by gen_seq4.pl 2025-02-10.ack/arrlamb at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.triangle.LambdaArray;

/**
 * A357869 Square array T(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals downwards, where T(n,k) = Sum_{j=0..n} (k*j)!* Stirling2(n,k*j)/j!.
 * @author Georg Fischer
 */
public class A357869 extends LambdaArray {

  /** Construct the sequence. */
  public A357869() {
    super(0, 0, 0, -1, (n, k) -> Rationals.SINGLETON.sum(0, n, j -> new Q(Functions.FACTORIAL.z(k * j)).multiply(Functions.STIRLING2.z(n, (long) k * j)).divide(Functions.FACTORIAL.z(j))).num());
  }
}
