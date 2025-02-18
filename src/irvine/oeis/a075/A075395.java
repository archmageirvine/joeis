package irvine.oeis.a075;

import irvine.oeis.FilterSequence;

/**
 * A075395 Composite members of A075394.
 * @author Sean A. Irvine
 */
public class A075395 extends FilterSequence {

  /** Construct the sequence. */
  public A075395() {
    super(new A075394(), k -> !k.isProbablePrime());
  }
}
