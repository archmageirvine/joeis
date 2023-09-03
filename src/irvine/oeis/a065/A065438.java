package irvine.oeis.a065;

import irvine.oeis.ComplementSequence;

/**
 * A065438 Complement of A065039.
 * @author Sean A. Irvine
 */
public class A065438 extends ComplementSequence {

  /** Construct the sequence. */
  public A065438() {
    super(1, new A065039());
  }
}
