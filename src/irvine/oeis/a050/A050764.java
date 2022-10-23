package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050764 Numbers of form k^k (for values of k see A050763) containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050764 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z m = Z.valueOf(++mN).pow(mN);
      Z t = m;
      Z r = Z.NEG_ONE;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          continue outer;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
      return m;
    }
  }
}

