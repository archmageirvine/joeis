package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186646 Every fourth term of the sequence of natural numbers 1,2,3,4,... is halved.
 * @author Sean A. Irvine
 */
public class A186646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186646() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 2, 3, 2, 5, 6, 7, 4});
  }
}
