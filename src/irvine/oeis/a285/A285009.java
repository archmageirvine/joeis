package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285009.
 * @author Sean A. Irvine
 */
public class A285009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285009() {
    super(new long[] {1, -3, 3}, new long[] {9, 17, 28});
  }
}
