package irvine.oeis.a058;

import java.util.TreeMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058084 Smallest m such that binomial(m,k) = n for some k.
 * @author Sean A. Irvine
 */
public class A058084 implements Sequence {

  private final TreeMap<Z, Long> mA = new TreeMap<>();
  private long mM = -1;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (!mA.containsKey(mN)) {
      ++mM;
      for (long k = 0; k <= mM / 2; ++k) {
        mA.putIfAbsent(Binomial.binomial(mM, k), mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

