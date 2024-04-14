package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048975 Pairs of consecutive primes p, q, for which the smallest primitive root of q is 1 greater than the smallest primitive root of p.
 * @author Sean A. Irvine
 */
public class A048975 extends A000040 {

  private Z mA = null;
  private Z mP = super.next();

  @Override
  public Z next() {
    if (mA != null) {
      final Z t = mA;
      mA = null;
      return t;
    }
    while (true) {
      final Z p = mP;
      mP = super.next();
      mA = mP;
      if (Functions.LEAST_PRIMITIVE_ROOT.z(p).add(1).equals(Functions.LEAST_PRIMITIVE_ROOT.z(mP))) {
        return p;
      }
    }
  }
}

