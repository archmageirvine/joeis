package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016766.
 * @author Sean A. Irvine
 */
public class A016766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016766() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 36});
  }
}
