package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005827.
 * @author Sean A. Irvine
 */
public class A005827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005827() {
    super(new long[] {4, -10, 0, 5}, new long[] {1, 3, 13, 57});
  }
}

