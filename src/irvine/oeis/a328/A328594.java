package irvine.oeis.a328;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001477;

/**
 * A328594 Numbers whose binary expansion is aperiodic.
 * @author Gregory Morse
 */
public class A328594 extends FilterSequence {
  /** Construct the sequence. */
  public A328594() {
    super(1, new A001477(), k -> aperiodic(k.toString(2)));
  }

  private static boolean aperiodic(final String word) {
    return (word + word).indexOf(word, 1) == word.length();
  }
}
