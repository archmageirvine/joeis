package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051793.
 * @author Sean A. Irvine
 */
public class A051793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051793() {
    super(new long[] {1, 0, 1, 0, -1, 0, -1, 0}, new long[] {1, 1, 1, 1, 0, 1, 1, 1});
  }
}
