package irvine.oeis.a328;

import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001477;

/**
 * A328607 Numbers whose reversed binary expansion, without the most significant digit, is a necklace.
 * @author Gregory Morse
 */
public class A328607 extends FilterSequence {
  /** Construct the sequence. */
  public A328607() {
    super(0, new A001477(), k -> A328595.minimal(new StringBuilder(k.toString(2).substring(1)).reverse().toString(), false));
  }
}
