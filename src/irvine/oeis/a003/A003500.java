package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003500.
 * @author Sean A. Irvine
 */
public class A003500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003500() {
    super(new long[] {-1, 4}, new long[] {2, 4});
  }
}

