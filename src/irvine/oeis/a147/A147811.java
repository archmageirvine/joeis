package irvine.oeis.a147;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A147811 Alexandrian integers: numbers of the form n=pqr such that 1/n = 1/p - 1/q - 1/r for some integers p,q,r.
 * @author Sean A. Irvine
 */
public class A147811 implements Sequence {

  private final TreeSet<Z> mAlexandrian = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mAlexandrian.isEmpty() || mN.compareTo(mAlexandrian.first()) < 0) {
      mN = mN.add(1);
      final Z n2p1 = mN.square().add(1);
      for (final Z d : Cheetah.factor(n2p1).divisors()) {
        mAlexandrian.add(mN.multiply(mN.add(d)).multiply(n2p1.divide(d).add(mN)));
      }
    }
    return mAlexandrian.pollFirst();
  }
}
