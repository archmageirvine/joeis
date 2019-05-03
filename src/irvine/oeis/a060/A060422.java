package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060422 Number of acute triangles made from vertices of a regular <code>n-gon</code>.
 * @author Sean A. Irvine
 */
public class A060422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060422() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 0, 1, 0, 5, 2});
  }
}
