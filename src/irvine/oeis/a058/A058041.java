package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007412;

/**
 * A058041 Noncubes equal to the sum of cubes of their prime factors.
 * @author Sean A. Irvine
 */
public class A058041 extends A007412 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      Z sum = Z.ZERO;
      for (final Z p : Jaguar.factor(n).toZArray()) {
        sum = sum.add(p.pow(3));
      }
      if (sum.equals(n)) {
        return n;
      }
    }
  }
}
