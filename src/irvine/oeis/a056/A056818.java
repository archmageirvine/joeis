package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056818 A number n is included if n^2 divides n-th term of A056855.
 * @author Sean A. Irvine
 */
public class A056818 extends A056855 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(mN * mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

