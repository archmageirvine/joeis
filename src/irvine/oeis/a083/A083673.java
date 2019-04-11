package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083673 First differences have period 6: <code>2,-1,3,4,-3,7, 2,-1,3,4,-3,7, 2,-1,..</code>.
 * @author Sean A. Irvine
 */
public class A083673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083673() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {2, 4, 3, 6, 10, 7, 14});
  }
}
