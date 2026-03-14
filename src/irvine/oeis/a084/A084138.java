package irvine.oeis.a084;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a060.A060715;

/**
 * A084138 a(n) is the number of times n is in sequence A060715, i.e., there are exactly a(n) cases where there are exactly n primes between m and 2m, exclusively, for m &gt; 0.
 * @author Sean A. Irvine
 */
public class A084138 extends Sequence0 {

  private final TreeMap<Z, Long> mCounts = new TreeMap<>();
  private final Sequence mA = new A060715();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (true) {
      final Z t = mA.next();
      mCounts.merge(t, 1L, Long::sum);
      if (t.compareTo(Z.FIVE) > 0 && t.divide(3 * (long) Math.ceil(Math.log(t.doubleValue()))).compareTo(mN) > 0) {
        break;
      }
    }
    return Z.valueOf(mCounts.remove(mN));
  }
}

