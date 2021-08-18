package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050723 Numbers k such that the decimal expansion of 2^k contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050723 implements Sequence {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    outer:
    while (true) {
      if (++mN > 0) {
        mT = mT.multiply2();
      }
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
      return Z.valueOf(mN);
    }
  }
}

