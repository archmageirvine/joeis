package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047670 Row 6 of array in A047666.
 * @author Sean A. Irvine
 */
public class A047670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047670() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {6, 37, 158, 529, 1486, 3653, 8086});
  }
}
