package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086531 a(1) = 9; a(n+1) is the least odd composite number not already used such that (a(n+1)+a(n))/2 is prime.
 * @author Sean A. Irvine
 */
public class A086531 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 15;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.NINE;
      return Z.NINE;
    }
    while (mUsed.remove(mLeastUnused) || Predicates.PRIME.is(mLeastUnused)) {
      mLeastUnused += 2;
    }
    long k = mLeastUnused;
    while (mUsed.contains(k) || Predicates.PRIME.is(k) || !mA.add(k).divide2().isProbablePrime()) {
      k += 2;
    }
    mUsed.add(k);
    mA = Z.valueOf(k);
    return mA;
  }
}

