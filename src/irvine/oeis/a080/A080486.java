package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080486 a(1) = 1, a(n) = smallest multiple of a(n-1) (not equal to 10^k*a(n-1)) obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A080486 extends Sequence1 {

  private Z mA = null;
  private final Z mStart;

  protected A080486(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A080486() {
    this(Z.ONE);
  }

  static boolean is(Z f, Z n) {
    while (!n.isZero() && !f.isZero()) {
      final Z[] qr = f.divideAndRemainder(10);
      if (qr[1].equals(n.mod(10))) {
        n = n.divide(10);
      }
      f = qr[0];
    }
    return n.isZero();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      Z t = mA;
      long k = 1;
      long skip = 10;
      while (true) {
        t = t.add(mA);
        if (++k == skip) {
          skip *= 10;
          continue;
        }
        if (is(t, mA)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}

