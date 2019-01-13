package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289705.
 * @author Sean A. Irvine
 */
public class A289705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289705() {
    super(new long[] {-1, 4, -4, -4, 10, -4, -4, 4}, new long[] {0, 0, 15, 96, 330, 855, 1866, 3624});
  }
}
