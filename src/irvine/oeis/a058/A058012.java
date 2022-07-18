package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A058012 Consider the sequence {b(m)} of composite numbers (excluding 1); sequence gives values of m where gcd(m, b(m)) increases.
 * @author Sean A. Irvine
 */
public class A058012 extends A002808 {

  private Z mN = Z.ZERO;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z c = super.next();
      final Z g = mN.gcd(c);
      if (g.compareTo(mMax) > 0) {
        mMax = g;
        return c;
      }
    }
  }
}
