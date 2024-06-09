package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070520.
 * @author Sean A. Irvine
 */
public class A070520 extends FilterSequence {

  /** Construct the sequence. */
  public A070520() {
    super(1, new A070518(), PRIME);
  }
}
