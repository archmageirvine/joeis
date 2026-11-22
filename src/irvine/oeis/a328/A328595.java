package irvine.oeis.a328;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;

/**
 * A328595 Numbers whose reversed binary expansion is a necklace.
 * @author Gregory Morse
 */
public class A328595 extends FilterSequence {
  /** Construct the sequence. */
  public A328595() {
    super(1, new A000027(), k -> minimal(new StringBuilder(k.toString(2)).reverse().toString(), false));
  }

  protected static boolean minimal(final String word, final boolean strict) {
    for (int k = 1; k < word.length(); ++k) {
      final int cmp = word.compareTo(word.substring(k) + word.substring(0, k));
      if (cmp > 0 || (strict && cmp == 0)) {
        return false;
      }
    }
    return true;
  }
}
