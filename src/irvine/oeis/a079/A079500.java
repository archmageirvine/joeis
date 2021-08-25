package irvine.oeis.a079;
// manually dersimple at 2021-08-25 21:26

import irvine.math.z.Z;
import irvine.oeis.a048.A048888;

/**
 * A079500 Number of compositions of the integer n in which the first part is &gt;= the other parts.
 * @author Georg Fischer
 */
public class A079500 extends A048888 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ONE : super.next().add(1);
  }
}
