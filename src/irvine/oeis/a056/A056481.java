package irvine.oeis.a056;

import irvine.oeis.PrependSequence;

/**
 * A056481 Number of primitive (aperiodic) palindromic structures using exactly two different symbols.
 * @author Georg Fischer
 */
public class A056481 extends PrependSequence {

  /** Construct the sequence. */
  public A056481() {
    super(new A056476().skip(2), 0, 0);
  }
}
