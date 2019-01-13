package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003501.
 * @author Sean A. Irvine
 */
public class A003501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003501() {
    super(new long[] {-1, 5}, new long[] {2, 5});
  }
}

