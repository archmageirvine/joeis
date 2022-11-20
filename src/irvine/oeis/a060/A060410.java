package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a006.A006884;

/**
 * A060410 In the '3x+1' problem, take the sequence of starting values which set new records for the highest point of the trajectory before reaching 1 (A006884); sequence gives associated maximal value reached in the trajectory with that start.
 * @author Sean A. Irvine
 */
public class A060410 extends A006884 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z m = super.next();
    Z max = m;
    while (!Z.ONE.equals(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1).divide2();
      max = max.max(m);
    }
    return max;
  }
}
