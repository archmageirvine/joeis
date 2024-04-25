package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069319 Number of 15 X n binary arrays with a path of adjacent 1's from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069319 extends A069295 {

  private int mN = 1;

  @Override
  public Z next() {
    return count(15, ++mN);
  }
}
