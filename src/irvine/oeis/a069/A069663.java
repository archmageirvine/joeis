package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069663 Smallest n-digit prime with minimum digit sum.
 * @author Sean A. Irvine
 */
public class A069663 extends Sequence1 {

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
    for (Z u = Z.TEN; u.compareTo(t) <= 0; u = u.multiply(10)) {
      final Z v = t1.add(u);
      if (v.isProbablePrime()) {
        return v;
      }
    }
    // We now need to add 3, but there is more than one way to do that
    // First try making the last digit 3
    final Z t3 = t.add(3);
    if (t3.isProbablePrime()) {
      return t3;
    }
    // Otherwise, the last digit could be "1" and there might be a "2" or two more "1"
    for (Z k = Z.TEN; k.compareTo(t) <= 0; k = k.multiply(10)) {
      final Z v = t1.add(k);
      for (Z j = Z.TEN; j.compareTo(k) <= 0; j = j.multiply(10)) {
        final Z w = v.add(j);
        if (w.isProbablePrime()) {
          return w;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
