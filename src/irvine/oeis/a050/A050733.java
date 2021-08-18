package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050733 Numbers of form 3^k (values of k see A050724) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050733 implements Sequence {

  private Z mT = null;

  protected long multiplier() {
    return 3;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      mT = mT == null ? Z.ONE : mT.multiply(multiplier());
      Z r = Z.NEG_ONE;
      Z t = mT;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          continue outer;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
      return mT;
    }
  }
}

