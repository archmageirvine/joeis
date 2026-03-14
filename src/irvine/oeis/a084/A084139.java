package irvine.oeis.a084;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a060.A060715;

/**
 * A084139 a(n) is the largest number for which exactly n primes are bounded between a(n) and 2a(n) exclusively.
 * @author Sean A. Irvine
 */
public class A084139 extends Sequence0 {

  private final TreeMap<Z, Long> mCounts = new TreeMap<>();
  private final Sequence mA = new A060715();
  private Z mN = Z.NEG_ONE;
  private long mM = 0;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (true) {
      ++mM;
      final Z t = mA.next();
      mCounts.put(t, mM);
      if (t.compareTo(Z.FIVE) > 0 && t.divide(3 * (long) Math.ceil(Math.log(t.doubleValue()))).compareTo(mN) > 0) {
        break;
      }
    }
    return Z.valueOf(mCounts.remove(mN));
  }
}

