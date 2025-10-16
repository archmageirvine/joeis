package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A389506 Smallest even number which cannot be written as the difference of two numbers which are less than and relatively prime to (the primorial) p(n)#.
 * @author Sean A. Irvine
 */
public class A389506 extends Sequence2 {

  private int mN = 1;
  private long mM = 2;

  private boolean is(final LongDynamicBooleanArray forbidden, final long primorial, final long m) {
    for (long k = 1; m + k <= primorial; ++k) {
      if (!forbidden.isSet(k) && !forbidden.isSet(m + k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final long primorial = Functions.PRIMORIAL_COUNT.l(++mN);
    // Sieve numbers to determine relative prime status
    final LongDynamicBooleanArray forbidden = new LongDynamicBooleanArray();
    long p = 2;
    long prod = 2;
    while (prod <= primorial) {
      for (long q = p; q <= primorial; q += p) {
        forbidden.set(q);
      }
      p = Functions.NEXT_PRIME.l(p);
      prod *= p;
    }
    // Now find the number
    while (true) {
      if (is(forbidden, primorial, mM)) {
        return Z.valueOf(mM);
      }
      mM += 2;
    }
  }
}
