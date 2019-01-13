package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083328.
 * @author Sean A. Irvine
 */
public class A083328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083328() {
    super(new long[] {-360, 342, -119, 18}, new long[] {0, 1, 9, 64});
  }
}
