package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A052022 Smallest number m larger than prime(n) such that prime(n) = sum of digits of m and prime(n) = largest prime factor of m (or 0 if no such number exists).
 * @author Sean A. Irvine
 */
public class A052022 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    final Z p = super.next();
    final long pp = p.longValueExact();
    Z m = p;
    while (true) {
      m = m.add(p); // We require p | m
      if (ZUtils.digitSum(m) == pp) {
        final Z[] f = Jaguar.factor(m).toZArray();
        if (f[f.length - 1].equals(p)) {
          return m;
        }
      }
    }
  }
}
