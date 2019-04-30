package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291252 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where p(S) <code>= (1 -</code> S^3)^3.
 * @author Sean A. Irvine
 */
public class A291252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291252() {
    super(new long[] {1, 0, -9, 3, 36, -18, -81, 45, 117, -59, -117, 45, 81, -18, -36, 3, 9, 0}, new long[] {0, 0, 3, 0, 9, 6, 18, 36, 40, 126, 135, 351, 513, 936, 1755, 2682, 5373, 8260});
  }
}
