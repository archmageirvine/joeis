package irvine.oeis.a064;
// manually dersimple at 2021-08-25 11:05

import irvine.math.z.Z;
import irvine.oeis.a006.A006666;

/**
 * A064433 Number of iterations of A064455 to reach 2 (or 1 in the case of 1).
 * @author Georg Fischer
 */
public class A064433 extends A006666 {

  private int mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ONE : super.next().add(1);
  }
}
