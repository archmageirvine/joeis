package irvine.oeis.a078;
// manually 2025-02-19/tablamb at 2025-02-21 21:41

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A078739 Generalized Stirling2 array (2,2).
 * @author Georg Fischer
 */
public class A078739 extends LambdaTable {

  /** Construct the sequence. */
  public A078739() {
    this(1, 2, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param r first parameter
   * @param s second parameters
   */
  public A078739(final int offset, final int r, final int s) {
    super(offset, 1, n -> new Integer[] {s, s * n}, (n, k) -> Integers.SINGLETON.sum(s, k, p -> Z.NEG_ONE.pow(p).multiply(Binomial.binomial(k, p)).multiply(
      Integers.SINGLETON.product(1, n, j -> Functions.FALLING_FACTORIAL.z(p + (long) (r - s) * (j - 1), s)))).multiply(Z.NEG_ONE.pow(k)).divide(Functions.FACTORIAL.z(k)));
  }
}
