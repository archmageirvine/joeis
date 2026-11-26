package irvine.oeis.a085;

import irvine.math.group.Gl2ClassAlgebra;
import irvine.oeis.LambdaSequence;

/**
 * A085646 Sum of the entries in the character table of the group GL(2,Z_n).
 * @author Gregory Morse
 */
public class A085646 extends LambdaSequence {

  /** Construct the sequence. */
  public A085646() {
    super(1, Gl2ClassAlgebra::characterSum);
  }
}
