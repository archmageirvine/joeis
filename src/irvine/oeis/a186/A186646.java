package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186646 Every fourth term of the sequence of natural numbers <code>1,2,3,4,</code>... is halved.
 * @author Sean A. Irvine
 */
public class A186646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186646() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 2, 3, 2, 5, 6, 7, 4});
  }
}
