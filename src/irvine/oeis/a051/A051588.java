package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051588 Number of 3 X n binary matrices such that any 2 rows have a common 1.
 * @author Sean A. Irvine
 */
public class A051588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051588() {
    super(new long[] {-960, 712, -194, 23}, new long[] {0, 1, 15, 175});
  }
}
