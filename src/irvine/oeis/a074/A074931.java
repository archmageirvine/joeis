package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074931 extends A000040 {

  private boolean checkRange(final Z p3, final Z t) {
    for (Z q = mPrime.nextPrime(p3); q.compareTo(t) < 0; q = mPrime.nextPrime(q)) {
      if (q.add(2).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p3 = p.multiply(3);
      Z a = Functions.PREV_PRIME.z(p3);
      while (!a.subtract(2).isProbablePrime()) {
        a = Functions.PREV_PRIME.z(a);
      }
      final Z t = p3.add(p3.subtract(a));
      if (t.isProbablePrime() && t.add(2).isProbablePrime() && checkRange(p3, t)) {
        return p;
      }
    }
  }
}
