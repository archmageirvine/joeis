package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051856 Numbers n such that (n!)^2+n!+1 is prime.
 * @author Sean A. Irvine
 */
public class A051856 extends A000142 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.square().add(f).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
