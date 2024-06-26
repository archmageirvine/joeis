package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A089848 Number of fixed points in range [A014137(n-1)..A014138(n-1)] of permutation A089851/A089853.
 * @author Georg Fischer
 */
public class A089848 extends LambdaSequence {

  /** Construct the sequence. */
  public A089848() {
    super(0, n -> (n == 0) ? Z.ONE : (n % 3 < 2) ? Functions.CATALAN.z(n - 1) : Functions.CATALAN.z(n - 1).add(Functions.CATALAN.z((n - 2) / 3)));
  }
}
