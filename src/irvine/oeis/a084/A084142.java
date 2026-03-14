package irvine.oeis.a084;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060715;

/**
 * A084142 Positive numbers k such that the number of primes between k and 2*k is different from the number of primes between m and 2*m for every number m != k.
 * @author Sean A. Irvine
 */
public class A084142 extends Sequence1 {

  private final TreeMap<Z, Long> mCounts = new TreeMap<>();
  private final TreeMap<Z, Long> mFirsts = new TreeMap<>();
  private final Sequence mA = new A060715();
  private Z mN = Z.NEG_ONE;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (true) {
        ++mM;
        final Z t = mA.next();
        mCounts.merge(t, 1L, Long::sum);
        mFirsts.put(t, mM);
        if (t.compareTo(Z.FIVE) > 0 && t.divide(3 * (long) Math.ceil(Math.log(t.doubleValue()))).compareTo(mN) > 0) {
          break;
        }
      }
      final long cnt = mCounts.remove(mN);
      final long first = mFirsts.remove(mN);
      if (cnt == 1) {
        return Z.valueOf(first);
      }
    }
  }
}

