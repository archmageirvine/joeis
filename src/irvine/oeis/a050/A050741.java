package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050741 Numbers k such that the decimal expansion of k^2 contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050741 implements Sequence {

  private long mN = -1;

  protected long power() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      Z t = Z.valueOf(++mN).pow(power());
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

