package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051875 23-gonal numbers: a(n) = n(21n-19)/2.
 * @author Sean A. Irvine
 */
public class A051875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051875() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 23});
  }
}
