package irvine.oeis.a137;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A137841 Number of distinct n-ary operators in a quinternary logic.
 * @author Georg Fischer
 */
public class A137841 extends LambdaSequence {

  /** Construct the sequence. */
  public A137841() {
    super(0, n -> Z.FIVE.pow(Z.FIVE.pow(n)));
  }
}
