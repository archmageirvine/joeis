package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086092.
 * @author Sean A. Irvine
 */
public class A086092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086092() {
    super(new long[] {100, -65, 14}, new long[] {1, 7, 46});
  }
}
