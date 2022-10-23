package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A046029 Numbers n such that (n!)^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A046029 extends A000142 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().square().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
