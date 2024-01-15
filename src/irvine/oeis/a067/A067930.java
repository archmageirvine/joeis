package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A067930 Nonprime solutions to k == -1 (mod phi(k+1)).
 * @author Sean A. Irvine
 */
public class A067930 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z u = t.add(1);
      if (u.mod(Euler.phi(u)).isZero()) {
        return t;
      }
    }
  }
}
