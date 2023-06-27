package irvine.oeis.a068;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A068628 Numbers occurring twice in A068627.
 * @author Sean A. Irvine
 */
public class A068628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068628() {
    super(1, new long[] {1, -3, 3}, new long[] {0, 60, 216});
  }
}
