package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285794.
 * @author Sean A. Irvine
 */
public class A285794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285794() {
    super(new long[] {3, 2, 1}, new long[] {1, 2, 3});
  }
}
