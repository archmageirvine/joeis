package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051930.
 * @author Sean A. Irvine
 */
public class A051930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051930() {
    super(new long[] {1, 6, 4}, new long[] {6, 1, 31});
  }
}
