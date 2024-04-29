package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069388 Number of n X 13 binary arrays with a path of adjacent 1's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069388 extends A069363 {

  private int mN = 0;

  @Override
  public Z next() {
    return count(13, ++mN);
  }
}
