package irvine.oeis.a275;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001477;

/**
 * A275692 Numbers k such that every rotation of the binary digits of k is less than k.
 * @author Gregory Morse
 */
public class A275692 extends FilterSequence {
  /** Construct the sequence. */
  public A275692() {
    super(1, new A001477(), k -> maximal(k.toString(2)));
  }

  private static boolean maximal(final String word) {
    for (int k = 1; k < word.length(); ++k) {
      if (word.compareTo(word.substring(k) + word.substring(0, k)) <= 0) {
        return false;
      }
    }
    return true;
  }
}
