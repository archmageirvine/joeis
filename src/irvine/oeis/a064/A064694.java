package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064694 Add column entries of the table with rows <code>(1,2,0,0</code>...), <code>(0,3,4,5,0,0</code>...), <code>(0,0,6,7,8,9,0,0</code>...), <code>(0,0,0,10,11,12,13,14,0,0</code>...), ...
 * @author Sean A. Irvine
 */
public class A064694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064694() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 10, 22, 34, 58, 80});
  }
}
