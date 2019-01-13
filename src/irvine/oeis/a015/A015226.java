package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015226.
 * @author Sean A. Irvine
 */
public class A015226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015226() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {22, 50, 252, 372, 946, 1222, 2360});
  }
}
