package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050749 Squares containing no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050749 extends Sequence0 {

  private long mN = -1;

  protected long power() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z m = Z.valueOf(++mN).pow(power());
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

