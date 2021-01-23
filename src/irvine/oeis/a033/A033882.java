package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033882 Abundancy of the abundant or perfect numbers: m = sigma(n)-2n for n such that m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A033882 extends A033880 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.signum() >= 0) {
        return a;
      }
    }
  }
}
