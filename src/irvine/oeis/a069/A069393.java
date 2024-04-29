package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069393 Number of n X 18 binary arrays with a path of adjacent 1's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069393 extends A069363 {

  private int mN = 0;

  @Override
  public Z next() {
    return count(18, ++mN);
  }
}
