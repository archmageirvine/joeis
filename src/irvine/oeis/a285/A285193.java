package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285193.
 * @author Sean A. Irvine
 */
public class A285193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285193() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 2, 0, 2, 1, 1, 0});
  }
}
