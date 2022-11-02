package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A307499 The number of primes between two consecutive prime Lucas numbers, bounds excluded.
 * @author Sean A. Irvine
 */
public class A307499 extends A000032 {

  private Z mP = null;
  {
    setOffset(1);
    while (mP == null) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        mP = t;
      }
    }
  }

  @Override
  public Z next() {
    Z lo = mP.add(1).or(Z.ONE);
    mP = null;
    while (mP == null) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        mP = t;
      }
    }
    long c = 0;
    while (lo.compareTo(mP) < 0) {
      if (lo.isProbablePrime()) {
        ++c;
      }
      lo = lo.add(2);
    }
    return Z.valueOf(c);
  }
}
