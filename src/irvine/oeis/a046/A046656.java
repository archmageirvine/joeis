package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046656 Square roots of sums of squares of divisors in A046655.
 * @author Sean A. Irvine
 */
public class A046656 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] s = Jaguar.factor(++mN).sigma2().sqrtAndRemainder();
      if (Z.ZERO.equals(s[1])) {
        return s[0];
      }
    }
  }
}
