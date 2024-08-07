package irvine.oeis.a137;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A137729 Number of circular permutations of the multiset {1,1,2,2,...,n,n} (up to rotations).
 * @author Georg Fischer
 */
public class A137729 extends LambdaSequence {

  /** Construct the sequence. */
  public A137729() {
    super(0, n -> n == 0 ? Z.ONE : Functions.FACTORIAL.z(2 * n).divide(Z.TWO.pow(n)).add(Functions.FACTORIAL.z(n)).divide(2L * n));
  }
}
