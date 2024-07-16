package irvine.oeis.a094;
// manually 2024-07-13

import irvine.math.function.Functions;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A094587 Triangle of permutation coefficients arranged with 1's on the diagonal. Also, triangle of permutations on n letters with exactly k+1 cycles and with the first k+1 letters in separate cycles.
 * Also, triangle of permutations on n letters with exactly k+1 cycles and with the first k+1 letters in separate cycles.
 * @author Georg Fischer
 */
public class A094587 extends LambdaTriangle {

  /** Construct the sequence. */
  public A094587() {
    super(0, 0, 0, (n, k) -> Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(k)));
  }
}
