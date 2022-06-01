package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036572 Number of tetrahedra in largest triangulation of polygonal prism with regular polygonal base.
 * @author Sean A. Irvine
 */
public class A036572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036572() {
    super(new long[] {1, -2, 0, 2}, new long[] {3, 6, 10, 14});
  }
}
