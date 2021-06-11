package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048261 Numbers that are the sum of the squares of distinct primes.
 * @author Sean A. Irvine
 */
public class A048261 extends A000040 {

  private final TreeSet<Z> mDone = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mDone.add(Z.ZERO);
  }
  private Z mP2 = super.next().square();

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first().compareTo(mP2) > 0) {
      final TreeSet<Z> t = new TreeSet<>();
      for (final Z s : mA) {
        t.add(s.add(mP2));
      }
      mA.addAll(t);
      for (final Z s : mDone) {
        mA.add(s.add(mP2));
      }
      mP2 = super.next().square();
    }
    final Z res = mA.pollFirst();
    mDone.add(res);
    return res;
  }
}
