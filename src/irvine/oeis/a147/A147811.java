package irvine.oeis.a147;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.TreeSet;

/**
 * A147811.
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
