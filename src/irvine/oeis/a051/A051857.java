package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051857 Numbers n such that (n!)^2-n!+1 is prime.
 * @author Sean A. Irvine
 */
public class A051857 extends A000142 {

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.pow(2).subtract(f).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
