package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060635 <code>a(n)</code> is the number of 2 X 1 domino tilings of the set S in the plane R^2 consisting of the union of the following two rectangles: rectangle1: <code>|x| &lt;= n, |y| &lt;= 1</code>, rectangle2: <code>|x| &lt;= 1, |y| &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A060635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060635() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {2, 8, 72, 450, 3200});
  }
}
