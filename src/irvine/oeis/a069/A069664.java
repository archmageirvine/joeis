package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069664 Largest n-digit prime with minimum digit sum.
 * @author Sean A. Irvine
 */
public class A069664 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(++mN);
    // t by itself 10... is never prime
    // Try adding a "1", this must be the last position to get a prime
    final Z t1 = t.add(1);
    if (t1.isProbablePrime()) {
      return t1;
    }
    // Still not prime, try adding another "1"
    for (Z u = t; !u.isZero(); u = u.divide(10)) {
      final Z v = t1.add(u);
      if (v.isProbablePrime()) {
        return v;
      }
    }
    // Still not prime, try adding "2" or two "1"s
    for (Z k = t; !k.isZero(); k = k.divide(10)) {
      final Z v = t1.add(k);
      for (Z j = k; !j.isZero(); j = j.divide(10)) {
        final Z w = v.add(j);
        if (w.isProbablePrime()) {
          return w;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
