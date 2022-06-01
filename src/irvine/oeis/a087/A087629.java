package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087629 Generalized Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A087629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087629() {
    super(new long[] {8, 0, 0, 7, 0, 0}, new long[] {1, 1, 3, 2, 11, 21});
  }
}
