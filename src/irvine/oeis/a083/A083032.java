package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083032.
 * @author Sean A. Irvine
 */
public class A083032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083032() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 7, 10, 12});
  }
}
