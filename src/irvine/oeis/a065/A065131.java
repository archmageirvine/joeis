package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a025.A025281;

/**
 * A065131 Arithmetic mean of first n terms of A001414 is an integer.
 * @author Sean A. Irvine
 */
public class A065131 extends A025281 {

  private long mN = 1;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

