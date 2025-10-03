package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080899 extends A065091 {

  // Arguably 2 should be a member of this sequence

  private boolean is(final Z p, final Z q) {
    for (Z t = p.add(1); t.compareTo(q) < 0; t = t.add(1)) {
      if (Functions.OMEGA.i(t) != 3) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p, mPrime.nextPrime(p))) {
        return p;
      }
    }
  }
}

