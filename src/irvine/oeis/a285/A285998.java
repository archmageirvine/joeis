package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285998.
 * @author Sean A. Irvine
 */
public class A285998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285998() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 4, 7, 16, 22, 40, 50});
  }
}
