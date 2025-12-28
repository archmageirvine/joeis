package irvine.oeis.a082;

import irvine.oeis.FilterSequence;

/**
 * A082870 Tribonacci array.
 * @author Sean A. Irvine
 */
public class A082870 extends FilterSequence {

  /** Construct the sequence. */
  public A082870() {
    super(0, new A082601(), NONZERO);
  }
}
