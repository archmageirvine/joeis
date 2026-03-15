package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a046.A046376;

/**
 * A084189 Minimum digit out of both prime factors of the numbers in A046376.
 * @author Sean A. Irvine
 */
public class A084189 extends A046376 {

  @Override
  public Z next() {
    long min = 10;
    for (final Z p : Jaguar.factor(super.next()).toZArray()) {
      int syn = Functions.SYNDROME.i(p);
      for (int m = 0; m < min; ++m) {
        if ((syn & (1L << m)) != 0) {
          min = Math.min(min, m);
          break;
        }
      }
      if (min == 0) {
        return Z.ZERO;
      }
    }
    return Z.valueOf(min);
  }
}
