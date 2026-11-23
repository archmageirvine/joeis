package irvine.oeis.a354;

import irvine.math.turing.JointSnake;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A354916 Maximum length of 4 finite snakes in the Snake Number Problem with n-periodic instructions in an infinite square grid.
 * @author Gregory Morse
 */
public class A354916 extends LambdaSequence {

  // Attaining words. Exhaustion of the normalized programs, including
  // exact non-halting proofs for the affine spirals, proves maximality.
  private static final String[] WORDS = {
    "URDL", "UURDL", "URRDLU", "URUULDU", "URUULLLD", "UUUURDUUL", "UUUDDRULLD", "UDRULUULDDD",
  };

  /** Construct the sequence. */
  public A354916() {
    super(4, n -> {
      if (n < 4 || n - 4 >= WORDS.length) {
        throw new UnsupportedOperationException("No certified census at period " + n);
      }
      return Z.valueOf(JointSnake.witnessLength(4, WORDS[(int) (n - 4)]));
    });
  }
}
