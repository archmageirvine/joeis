package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069305 Number of n X 14 binary arrays with a path of adjacent 1's from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069305 extends A069295 {

  private int mN = 1;

  @Override
  public Z next() {
    return count(++mN, 14);
  }
}
