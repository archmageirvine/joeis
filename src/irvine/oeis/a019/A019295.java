package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019295 a(n) = sigma(sigma(...(sigma(n))...)) / n, where sigma (A000203) is iterated until a multiple of n is reached.
 * @author Sean A. Irvine
 */
public class A019295 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z[] qr;
    do {
      m = Jaguar.factor(m).sigma();
      qr = m.divideAndRemainder(mN);
    } while (!qr[1].isZero());
    return qr[0];
  }
}

