package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066364 Prime divisors of solutions to 10^n == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A066364 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mP = 5;

  private boolean is(final Z[] v) {
    for (final Z u : v) {
      if (!mA.contains(u)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.THREE);
      return Z.THREE;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z[] v = Jaguar.factor(Functions.ORDER.z(mP, Z.TEN)).toZArray();
      if (is(v)) {
        final Z p = Z.valueOf(mP);
        mA.add(p);
        return p;
      }
    }
  }
}
