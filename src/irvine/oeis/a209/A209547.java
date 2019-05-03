package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209547 1/4 the number of <code>(n+1)X3 0..3</code> arrays with every <code>2X2</code> subblock having exactly two distinct clockwise edge differences.
 * @author Sean A. Irvine
 */
public class A209547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209547() {
    super(new long[] {-2, -8, 20, -3, -14, 8}, new long[] {20, 105, 562, 3051, 16582, 90186});
  }
}
