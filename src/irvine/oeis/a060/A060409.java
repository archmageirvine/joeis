package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a006.A006884;

/**
 * A060409 In the '3x+1' problem, take the sequence of starting values which set new records for the highest point of the trajectory before reaching 1 (A006884); sequence gives associated "dropping time", number of steps to reach a lower value than the start.
 * @author Sean A. Irvine
 */
public class A060409 extends A006884 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    long cnt = 0;
    Z m = t;
    while (m.compareTo(t) >= 0) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1).divide2();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
