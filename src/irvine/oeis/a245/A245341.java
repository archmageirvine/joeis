package irvine.oeis.a245;

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007953;
import irvine.oeis.a024.A024632;

/**
 * A245341 Sum of digits of n written in fractional base 5/2.
 * @author Georg Fischer
 */
public class A245341 extends NestedSequence {

  /** Construct the sequence. */
  public A245341() {
    super(0, new A007953(), new A024632(), 0, 0);
  }
}
