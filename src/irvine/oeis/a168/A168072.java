package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168072.
 * @author Sean A. Irvine
 */
public class A168072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168072() {
    super(new long[] {-81, 27, 0, 3}, new long[] {1, 3, -18, -135});
  }
}
