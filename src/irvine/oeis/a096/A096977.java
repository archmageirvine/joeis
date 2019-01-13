package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096977.
 * @author Sean A. Irvine
 */
public class A096977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096977() {
    super(new long[] {8, -14, 3, 4}, new long[] {0, 1, 2, 11});
  }
}
