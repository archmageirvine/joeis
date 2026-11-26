package irvine.oeis.a086;

import irvine.math.group.Gl2ClassAlgebra;
import irvine.oeis.LambdaSequence;

/**
 * A086643 Number of zeros in the character table of the group GL(2,Z_n).
 * @author Gregory Morse
 */
public class A086643 extends LambdaSequence {

  /** Construct the sequence. */
  public A086643() {
    super(1, Gl2ClassAlgebra::zeros);
  }
}
