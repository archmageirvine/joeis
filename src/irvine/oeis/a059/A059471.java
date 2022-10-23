package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059471 a(1) = 2; a(n+1) is obtained by trying to change just one digit of a(n), starting with the least significant digit, until a new prime is reached.
 * @author Sean A. Irvine
 */
public class A059471 extends Sequence1 {

  private static final Z LAST = Z.valueOf(3377464733L);
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else if (LAST.equals(mA)) { // comment out these lines to got past Zumkeller's claimed final term
      return null;
    } else {
      Z mod = Z.ONE;
      outer:
      while (true) {
        final Z[] qr = mA.divideAndRemainder(mod);
        final Z left = qr[0].divide(10).multiply(10);
        for (long add = left.isZero() ? 1 : 0; add < 10; ++add) {
          final Z u = left.add(add);
          if (!u.equals(qr[0])) {
            final Z t = u.multiply(mod).add(qr[1]);
            if (!mSeen.contains(t) && t.isProbablePrime()) {
              mA = t;
              break outer;
            }
          }
        }
        mod = mod.multiply(10);
      }
    }
    mSeen.add(mA);
    return mA;
  }
}
