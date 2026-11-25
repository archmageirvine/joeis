package irvine.oeis.a086;

import irvine.math.group.Gl3CharacterDegrees;
import irvine.oeis.LambdaSequence;

/**
 * A086782 Sum of the degrees of the irreducible representations of GL(3,Z_n).
 * @author Gregory Morse
 */
public class A086782 extends LambdaSequence {

  /** Construct the sequence. */
  public A086782() {
    super(1, Gl3CharacterDegrees::sum);
  }
}
