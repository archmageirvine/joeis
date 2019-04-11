package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203162 (n-1)-st elementary symmetric function of the first n terms of <code>(1,2,3,1,2,3,1,2,3,...)</code>.
 * @author Sean A. Irvine
 */
public class A203162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203162() {
    super(new long[] {-36, 0, 0, 12, 0, 0}, new long[] {1, 3, 11, 17, 40, 132});
  }
}
