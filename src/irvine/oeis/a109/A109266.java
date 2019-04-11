package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109266 Diagonal sums of Riordan array <code>(1-x-x^2,x(1-x))</code>.
 * @author Sean A. Irvine
 */
public class A109266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109266() {
    super(new long[] {-1, 1, 0}, new long[] {1, -1, 0});
  }
}
