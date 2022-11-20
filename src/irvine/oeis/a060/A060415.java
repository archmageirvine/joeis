package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060415 In the '3x+1' problem, take the sequence of starting values which set new records for the "dropping time" (A060412); sequence gives associated iterate where maximal value is reached in the trajectory with that start.
 * @author Sean A. Irvine
 */
public class A060415 extends A060412 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z max = t;
    long maxPos = 0;
    long cnt = 0;
    Z m = t;
    while (m.compareTo(t) >= 0) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1).divide2();
      ++cnt;
      if (m.compareTo(max) > 0) {
        max = m;
        maxPos = cnt;
      }
    }
    return Z.valueOf(maxPos);
  }
}
