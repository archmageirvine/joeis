package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002275;

/**
 * A391473 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A391473 extends Sequence1 {

  private static final long MOD = 1000000000L;
  private final Sequence mR = new A002275().skip();

  private boolean is(long n) {
    long parity = 2; // any value other than 1 or 0
    while (n != 0) {
      final long p = n % 10;
      if (p == parity) {
        return false;
      }
      parity = p;
      n /= 10;
    }
    return true;
  }

  private boolean is(Z n) {
    int parity = 2; // any value other than 1 or 0
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final int p = qr[1].testBit(0) ? 1 : 0;
      if (p == parity) {
        return false;
      }
      parity = p;
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    final Z r = mR.next();
    long k = 0;
    while (true) {
      final long t = (r.mod(MOD) * ++k) % MOD;
      if (is(t) && is(r.multiply(k))) {
        return Z.valueOf(k);
      }
    }
  }
}
