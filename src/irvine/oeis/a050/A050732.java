package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050732 Numbers of form 2^k (for values of k see A050723) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050732 implements Sequence {

  private Z mT = null;

  @Override
  public Z next() {
    outer:
    while (true) {
      mT = mT == null ? Z.ONE: mT.multiply2();
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

