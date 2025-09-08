package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;

/**
 * A080172 Final digit of n-th Mersenne prime A000668(n).
 * @author Sean A. Irvine
 */
public class A080172 extends A000043 {

  @Override
  public Z next() {
    return Z.TWO.modPow(super.next(), Z.TEN).subtract(1);
  }
}

