package irvine.oeis.a166;
// manually 2022-02-22

import irvine.oeis.NestedSequence;
import irvine.oeis.a006.A006512;
import irvine.oeis.a007.A007092;

/**
 * A166480 Greater of twin primes, written in base 6.
 * @author Georg Fischer
 */
public class A166480 extends NestedSequence {

  /** Construct the sequence. */
  public A166480() {
    super(1, new A007092(), new A006512(), 0, 1);
  }

}
