package irvine.oeis.a056;

import irvine.oeis.PrependSequence;

/**
 * A056481 Number of primitive (aperiodic) palindromic structures using exactly two different symbols.
 * @author Georg Fischer
 */
public class A056481 extends PrependSequence {

  /** Construct the sequence. */
  public A056481() {
    super(2, new A056476(), 0, 0);
  }
}
