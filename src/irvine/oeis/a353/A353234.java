package irvine.oeis.a353;

import irvine.math.turing.JointSnake;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353234 Maximum length of 2 finite snakes in the Snake Number Problem with n-periodic instructions in an infinite square grid.
 * @author Gregory Morse
 */
public class A353234 extends LambdaSequence {

  // Attaining instruction words listed by Giorgio Vecchi. Exhaustion of
  // normalized words, including the affine spirals, proves maximality.
  private static final String[] WORDS = {
    "URDL", "URDLU", "UURDLL", "UURDUUL", "UURDLUUL", "UUUURDUUL", "URUDLLDURR", "UDDRDDRDUDL",
    "URUDRDURDDDL", "UUDRUDDLUULDD",
  };

  /** Construct the sequence. */
  public A353234() {
    super(4, n -> {
      if (n < 4 || n - 4 >= WORDS.length) {
        throw new UnsupportedOperationException("No certified census at period " + n);
      }
      return Z.valueOf(JointSnake.witnessLength(2, WORDS[(int) (n - 4)]));
    });
  }
}
