package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082804 Smallest multiple of 9 beginning with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A082804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082804() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {18, 27, 36, 45, 54, 63, 72, 81, 9, 108, 117, 126, 135, 144, 153, 162, 171, 18});
  }
}
