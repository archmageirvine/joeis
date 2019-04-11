package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209547 <code>1/4</code> the number of (n+1)X3 <code>0..3</code> arrays with every 2X2 subblock having exactly two distinct clockwise edge differences.
 * @author Sean A. Irvine
 */
public class A209547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209547() {
    super(new long[] {-2, -8, 20, -3, -14, 8}, new long[] {20, 105, 562, 3051, 16582, 90186});
  }
}
