package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060414 In the '3x+1' problem, take the sequence of starting values which set new records for the "dropping time" (A060412); sequence gives associated maximal value reached in the trajectory with that start.
 * @author Sean A. Irvine
 */
public class A060414 extends A060412 {

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
