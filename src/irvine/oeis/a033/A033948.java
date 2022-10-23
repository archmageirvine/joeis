package irvine.oeis.a033;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033948 Numbers that have a primitive root (the multiplicative group modulo n is cyclic).
 * @author Sean A. Irvine
 */
public class A033948 extends Sequence1 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private final Fast mPrime = new Fast();
  protected Z mP = Z.THREE;
  {
    mA.put(Z.ONE, null);
    mA.put(Z.TWO, null);
    mA.put(Z.FOUR, null);
  }

  @Override
  public Z next() {
    if (mP.compareTo(mA.firstKey()) < 0) {
      mA.put(mP, mP);
      mA.put(mP.multiply2(), mP);
      mP = mPrime.nextPrime(mP);
    }
    final Map.Entry<Z, Z> e = mA.pollFirstEntry();
    if (e.getValue() != null) {
      mA.put(e.getKey().multiply(e.getValue()), e.getValue());
    }
    return e.getKey();
  }
}
