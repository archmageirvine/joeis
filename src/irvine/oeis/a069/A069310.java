package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069310 Number of 6 X n binary arrays with a path of adjacent 1's from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069310 extends A069295 {

  private int mN = 1;

  @Override
  public Z next() {
    return count(6, ++mN);
  }
}
