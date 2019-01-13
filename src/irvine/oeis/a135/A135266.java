package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135266.
 * @author Sean A. Irvine
 */
public class A135266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135266() {
    super(new long[] {-3, 4, -1, -3, 4}, new long[] {0, 1, 5, 19, 60});
  }
}
