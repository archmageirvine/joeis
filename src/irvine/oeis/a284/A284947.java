package irvine.oeis.a284;
// Generated by gen_seq4.pl 2024-03-22/tablamb at 2024-03-24 22:44

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A284947 Irregular triangle read by rows: coefficients of the cycle polynomial of the n-complete graph K_n.
 * @author Georg Fischer
 */
public class A284947 extends LambdaTable {

  /** Construct the sequence. */
  public A284947() {
    super(3, 3, n -> new Integer[] {0, n}, (n, k) -> k < 3 ? Z.ZERO : Binomial.binomial(n, k).multiply(Integers.SINGLETON.product(0, k - 3 - 1, j -> Z.valueOf(j + 3))));
  }
}
