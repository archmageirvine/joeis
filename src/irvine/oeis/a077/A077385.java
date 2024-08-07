package irvine.oeis.a077;
// Generated by gen_seq4.pl manch4/tablamb at 2024-03-12 13:36

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A077385 Triangle read by rows in which n-th row contains 2n-1 terms starting from n^0 to n^(n-1) in increasing order and then in decreasing order to n^0.
 * @author Georg Fischer
 */
public class A077385 extends LambdaTable {

  /** Construct the sequence. */
  public A077385() {
    super(1, 1, n -> new Integer[]{0, 2 * n - 2}, (n, k) -> (k < n) ? Z.valueOf(n).pow(k) : Z.valueOf(n).pow(2L * n - k - 2));
  }
}
