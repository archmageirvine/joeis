package irvine.oeis.a061;

import java.util.Collection;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061359 a(1) = 1; a(n) = least number such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A061359 extends Sequence1 {

  private final Z mInitial;
  private Z mA = null;
  private Z mMod = Z.ONE;

  protected A061359(final Z initial) {
    mInitial = initial;
  }

  /** Construct the sequence. */
  public A061359() {
    this(Z.ONE);
  }

  private Z solve(final Z c, final Z m) {
    final Collection<Z> res = QuadraticCongruence.solve(Z.ONE, Z.ZERO, c.negate(), m);
    if (res.isEmpty()) {
      // Congruence solving failed for some reason
      throw new UnsupportedOperationException();
    }
    Z t = Z.ZERO;
    while (true) {
      for (final Z x : res) {
        final Z x2 = x.add(t).square();
        if (!x2.equals(c)) {
          return x2;
        }
      }
      t = t.add(m);
    }
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mInitial;
      return mInitial;
    }
    while (mMod.compareTo(mA) <= 0) {
      mMod = mMod.multiply(10);
    }
    mA = solve(mA, mMod);
    return mA.divide(mMod);
  }
}

