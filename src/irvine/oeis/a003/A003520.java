package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003520.
 * @author Sean A. Irvine
 */
public class A003520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003520() {
    super(new long[] {1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
