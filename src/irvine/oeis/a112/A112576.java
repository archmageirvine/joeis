package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112576.
 * @author Sean A. Irvine
 */
public class A112576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112576() {
    super(new long[] {-1, -1, 3, 1}, new long[] {0, 1, 1, 4});
  }
}
