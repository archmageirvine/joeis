package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048102 Numbers k such that if k = Product p_i^e_i then p_i=e_i for all i.
 * @author Sean A. Irvine
 */
public class A048102 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeSet<Z> mDone = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mT = Z.FOUR;
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first().compareTo(mT) > 0) {
      final TreeSet<Z> next = new TreeSet<>();
      for (final Z t : mA) {
        next.add(t.multiply(mT));
      }
      mA.addAll(next);
      for (final Z t : mDone) {
        mA.add(t.multiply(mT));
      }
      mP = mPrime.nextPrime(mP);
      mT = mP.pow(mP);
    }
    final Z res = mA.pollFirst();
    mDone.add(res);
    return res;
  }
}
