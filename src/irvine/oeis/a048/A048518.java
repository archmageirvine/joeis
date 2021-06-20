package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a031.A031955;

/**
 * A048518 Primes containing only two different digits whose sum of digits is 28, the second perfect number.
 * @author Sean A. Irvine
 */
public class A048518 extends A031955 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime() && ZUtils.digitSum(t) == 28) {
        return t;
      }
    }
  }
}
