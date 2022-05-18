package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001599;

/**
 * A035527 Harmonic seed numbers.
 * @author Sean A. Irvine
 */
public class A035527 extends A001599 {

  private final TreeSet<Z> mHarmonic = new TreeSet<>();

  private boolean isA035527(final Z h) {
    for (final Z d : Jaguar.factor(h).divisors()) {
      if (mHarmonic.contains(d) && !d.equals(h) && !Z.ONE.equals(d) && Z.ONE.equals(d.gcd(h.divide(d)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z h = super.next();
      mHarmonic.add(h);
      if (isA035527(h)) {
        return h;
      }
    }
  }
}

