package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A084931 Consider trajectory of n under repeated applications of the function f(x) = 'Sum of the prime factors of x (with multiplicity)' (see A029908). Sequence gives composite numbers n that end at a prime m that divides n and m is greater than any m's seen already.
 * @author Sean A. Irvine
 */
public class A084931 extends A002808 {

  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      Z m = n;
      Z prev;
      do {
        prev = m;
        m = Functions.SOPFR.z(m);
      } while (!m.isZero() && !prev.equals(m));
      if (n.mod(m).isZero() && m.isProbablePrime() && m.compareTo(mRecord) > 0) {
        mRecord = m;
        return n;
      }
    }
  }
}

