package irvine.oeis.a137;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A137840 Number of distinct n-ary operators in a quaternary logic.
 * @author Georg Fischer
 */
public class A137840 extends LambdaSequence {

  /** Construct the sequence. */
  public A137840() {
    super(0, n -> Z.FOUR.pow(Z.FOUR.pow(n)));
  }
}
