package irvine.oeis.a080;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000720;

/**
 * A080289 Integers n for which the ratio phi(n)/pi(n) is smaller than for any subsequent n. Here phi(n) is Euler's totient function and pi(n) is the number of primes that are at most n.
 * @author Sean A. Irvine
 */
public class A080289 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 3;
  private final TreeMap<Q, Long> mBest = new TreeMap<>();
  private final Sequence mPhi = new A000010().skip();
  private final Sequence mPi = new A000720().skip();
  private Q mLastReported = Q.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    while (mBest.size() < HEURISTIC * Math.log(mN + 1)) {
      ++mN;
      final Q t = new Q(mPhi.next(), mPi.next());
      if (t.compareTo(mLastReported) < 0) {
        throw new RuntimeException("Heuristic failed, at one previously output value was incorrect");
      }
      mBest.tailMap(t).clear();
      mBest.put(t, mN);
    }
    final Map.Entry<Q, Long> e = mBest.pollFirstEntry();
    mLastReported = e.getKey();
    return Z.valueOf(e.getValue());
  }
}

