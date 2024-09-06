package irvine.oeis.a243;

import irvine.oeis.FilterSequence;
import irvine.oeis.a214.A214829;

/**
 * A243623 Prime terms in A214829.
 * @author Georg Fischer
 */
public class A243623 extends FilterSequence {

  /** Construct the sequence. */
  public A243623() {
    super(1, new A214829(), PRIME);
    skip();
  }
}
