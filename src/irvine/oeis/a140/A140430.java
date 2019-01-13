package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140430.
 * @author Sean A. Irvine
 */
public class A140430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140430() {
    super(new long[] {1, -1, 0, 1}, new long[] {3, 2, 4, 1});
  }
}
