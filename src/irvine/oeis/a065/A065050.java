package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008292;

/**
 * A065050 Prime numbers in the triangle of Eulerian numbers.
 * @author Sean A. Irvine
 */
public class A065050 extends Sequence1 {

  private final A008292 mEuler = new A008292();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    Z t = mEuler.get(mN, 2L);
    while (mA.isEmpty() || mA.first().compareTo(t) >= 0) {
      for (long k = 2; 2 * k <= mN; ++k) {
        final Z u = mEuler.get(mN, k);
        if (u.isProbablePrime()) {
          mA.add(u);
        }
      }
      t = mEuler.get(++mN, 2L);
    }
    return mA.pollFirst();
  }
}

