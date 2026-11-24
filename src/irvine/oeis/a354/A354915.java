package irvine.oeis.a354;

import irvine.math.turing.JointSnake;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A354915 Maximum length of 3 finite snakes in the Snake Number Problem with n-periodic instructions in an infinite square grid (see Comments).
 * @author Gregory Morse
 */
public class A354915 extends LambdaSequence {

  // Attaining words. Exhaustion of the normalized programs, including
  // exact non-halting proofs for the affine spirals, proves maximality.
  private static final String[] WORDS = {
    "URDL", "URDLU", "UURDUL", "URUULDU", "URURUULD", "URDDDDDDL", "UUURUDLLDD", "UUDDRDUUUDL",
  };

  /** Construct the sequence. */
  public A354915() {
    super(4, n -> {
      if (n < 4 || n - 4 >= WORDS.length) {
        throw new UnsupportedOperationException("No certified census at period " + n);
      }
      return Z.valueOf(JointSnake.witnessLength(3, WORDS[(int) (n - 4)]));
    });
  }
}
