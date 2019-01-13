package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024002.
 * @author Sean A. Irvine
 */
public class A024002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024002() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 0, -15, -80, -255});
  }
}
