package irvine.oeis.a141;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A141475 Number of Turing machines with n states following the standard formalism of the busy beaver problem where the head of a Turing machine either moves to the right or to the left, but none once halted.
 * @author Gregory Morse
 */
public class A141475 extends LambdaSequence {
  /** Construct the sequence. */
  public A141475() {
    super(0, n -> Z.valueOf(4L * n + 2).pow(2L * n));
  }
}
