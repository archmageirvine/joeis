package irvine.oeis.a328;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000027;

/**
 * A328596 Numbers whose reversed binary expansion is a Lyndon word (aperiodic necklace).
 * @author Gregory Morse
 */
public class A328596 extends FilterSequence {
  /** Construct the sequence. */
  public A328596() {
    super(1, new A000027(), k -> A328595.minimal(new StringBuilder(k.toString(2)).reverse().toString(), true));
  }
}
