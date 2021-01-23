package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054623 Number of ways to color vertices of a 9-gon using &lt;= n colors, allowing only rotations.
 * @author Sean A. Irvine
 */
public class A054623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054623() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 60, 2195, 29144, 217045, 1119796, 4483815, 14913200, 43046889});
  }
}
