package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285872.
 * @author Sean A. Irvine
 */
public class A285872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285872() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 3, 4});
  }
}
