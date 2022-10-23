package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050763 Numbers k such that the decimal expansion of k^k contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050763 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      Z t = Z.valueOf(++mN).pow(mN);
      Z r = Z.NEG_ONE;
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

