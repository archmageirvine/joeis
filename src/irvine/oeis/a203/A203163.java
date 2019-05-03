package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203163 <code>(n-1)-st</code> elementary symmetric function of the first n terms of <code>(1,2,3,4,1,2,3,4,1,2,3,4,...) = A010883</code>.
 * @author Sean A. Irvine
 */
public class A203163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203163() {
    super(new long[] {-576, 0, 0, 0, 48, 0, 0, 0}, new long[] {1, 3, 11, 50, 74, 172, 564, 2400});
  }
}
