package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048167 Integer quotients of numbers k divisible by the number of unitary divisors of k (A034444).
 * @author Sean A. Irvine
 */
public class A048167 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = Z.ONE.shiftLeft(Jaguar.factor(mN).omega());
      final Z[] qr = mN.divideAndRemainder(t);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

