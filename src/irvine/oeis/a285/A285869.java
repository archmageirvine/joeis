package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285869.
 * @author Sean A. Irvine
 */
public class A285869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285869() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 1, 2});
  }
}
