package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089978.
 * @author Sean A. Irvine
 */
public class A089978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089978() {
    super(new long[] {3, 0, 3}, new long[] {1, 3, 9});
  }
}
