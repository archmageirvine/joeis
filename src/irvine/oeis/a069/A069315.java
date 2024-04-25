package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069315 11 X n binary arrays with a path of adjacent 1's from upper left corner to anywhere in right hand column.
 * @author Sean A. Irvine
 */
public class A069315 extends A069295 {

  private int mN = 1;

  @Override
  public Z next() {
    return count(11, ++mN);
  }
}
