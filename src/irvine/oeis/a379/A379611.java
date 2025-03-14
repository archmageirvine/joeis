package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-03.ack/trilambn at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A379611 Table read by rows: T(n, k) = (n + 1)^(n - 1) - (k - 1)*(n + 1)^(n - 2), by convention T(1, 0) = 1.
 * @author Georg Fischer
 */
public class A379611 extends LambdaTriangle {

  /** Construct the sequence. */
  public A379611() {
    super(0, 0, 0, (n, k) -> (n == 1 && k == 0) ? Z.ONE : Z.valueOf(n + 1).pow(n - 1).subtract(Z.valueOf(k - 1).multiply(Z.valueOf(n + 1).pow(n - 2))));
  }
}
