package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056954 A number n is included if n^2 divides n-th term of A056819.
 * @author Sean A. Irvine
 */
public class A056954 extends A056819 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod((long) mN * mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
