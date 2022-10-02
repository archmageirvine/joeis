package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059498 a(1) = 2; a(n+1) is obtained by trying to change just one digit of a(n), starting with the least significant digit, until a new prime is reached. Take the lexicographically earliest sequence. Digits may be replaced by any larger digit.
 * @author Sean A. Irvine
 */
public class A059498 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z mod = Z.ONE;
      outer:
      while (true) {
        final Z[] qr = mA.divideAndRemainder(mod);
        final Z left = qr[0].divide(10).multiply(10);
        for (long add = qr[0].mod(10) + 1; add < 10; ++add) {
          final Z u = left.add(add);
          if (!u.equals(qr[0])) {
            final Z t = u.multiply(mod).add(qr[1]);
            if (t.isProbablePrime()) {
              mA = t;
              break outer;
            }
          }
        }
        mod = mod.multiply(10);
      }
    }
    return mA;
  }
}
