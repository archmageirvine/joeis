package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033883 Deficiency of the deficient or perfect numbers: m <code>= 2n - sigma(n)</code> for n such that m <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A033883 extends A033879 {

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
