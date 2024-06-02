package irvine.oeis.a070;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070164 Least m such that cototient[m]-1=p[n].
 * @author Sean A. Irvine
 */
public class A070164 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashMap<Long, Long> mA = new HashMap<>();
  private long mN = 5;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mA.get(mP) == null) {
      final Z t = Functions.COTOTIENT.z(++mN).subtract(1);
      if (t.isProbablePrime()) {
        mA.putIfAbsent(t.longValueExact(), mN);
      }
    }
    return Z.valueOf(mA.remove(mP));
  }
}
