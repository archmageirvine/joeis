package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069371 Number of 13 X n binary arrays with a path of adjacent 1's from top row to bottom row.
 * @author Sean A. Irvine
 */
public class A069371 extends A069363 {

  private int mN = 0;

  @Override
  public Z next() {
    return count(++mN, 13);
  }
}
