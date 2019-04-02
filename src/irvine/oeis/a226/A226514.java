package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226514 Column 3 of array in A226513.
 * @author Sean A. Irvine
 */
public class A226514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226514() {
    super(new long[] {-1, 4, -6, 4}, new long[] {13, 44, 99, 184});
  }
}
