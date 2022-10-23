package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051855 Numbers n such that (n!)^4+1 is prime.
 * @author Sean A. Irvine
 */
public class A051855 extends A000142 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (f.pow(4).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
