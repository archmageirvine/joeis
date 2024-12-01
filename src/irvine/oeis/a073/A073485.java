package irvine.oeis.a073;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073485 Product of any number of consecutive primes; squarefree numbers with no gaps in their prime factorization.
 * @author Sean A. Irvine
 */
public class A073485 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mP = Z.THREE;
  {
    mA.put(Z.ONE, Z.ONE);
  }

  @Override
  public Z next() {
    if (mP.compareTo(mA.firstKey()) < 0) {
      mA.put(mP, mP);
      mP = mPrime.nextPrime(mP);
    }
    final Map.Entry<Z, Z> t = mA.pollFirstEntry();
    final Z q = mPrime.nextPrime(t.getValue());
    mA.put(t.getKey().multiply(q), q);
    return t.getKey();
  }
}
