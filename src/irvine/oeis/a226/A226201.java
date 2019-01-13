package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226201.
 * @author Sean A. Irvine
 */
public class A226201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226201() {
    super(new long[] {8, -17, 10}, new long[] {1, 9, 66});
  }
}
