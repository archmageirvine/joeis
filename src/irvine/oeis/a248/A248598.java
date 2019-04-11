package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248598 <code>a(n) = (2*n+23)*n*(n-1), a</code> coefficient appearing in the formula a(n)*Pi/324+n+1 giving the average number of regions into which n random planes divide the cube.
 * @author Sean A. Irvine
 */
public class A248598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248598() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 54, 174});
  }
}
