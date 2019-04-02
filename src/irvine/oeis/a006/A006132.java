package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003231;
import irvine.oeis.a003.A003234;

/**
 * A006132 Related to representations as sums of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A006132 extends A003231 {

  private final A003234 mOther = new A003234();

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mOther.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
