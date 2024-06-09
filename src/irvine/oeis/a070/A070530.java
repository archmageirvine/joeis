package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070520.
 * @author Sean A. Irvine
 */
public class A070530 extends FilterSequence {

  /** Construct the sequence. */
  public A070530() {
    super(1, new A070526(), PRIME);
  }
}
