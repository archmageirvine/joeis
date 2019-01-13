package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159665.
 * @author Sean A. Irvine
 */
public class A159665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159665() {
    super(new long[] {1, -575, 575}, new long[] {0, 48, 27600});
  }
}
