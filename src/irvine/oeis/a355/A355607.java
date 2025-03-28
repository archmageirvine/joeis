package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-02-10.ack/arrlamb at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.triangle.LambdaArray;

/**
 * A355607 Square array T(n,k), n&gt;=0, k&gt;=0, read by antidiagonals, where column k is the expansion of e.g.f. (1 + x)^(x^k).
 * @author Georg Fischer
 */
public class A355607 extends LambdaArray {

  /** Construct the sequence. */
  public A355607() {
    super(0, 0, 0, -1, (n, k) -> Rationals.SINGLETON.sum(0, n / (k + 1), j -> new Q(Functions.STIRLING1.z(n - (long) k * j, j)).divide(Functions.FACTORIAL.z(n - k * j))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
