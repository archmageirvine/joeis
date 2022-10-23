package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A048521 Primes expressible as the sum of an integer plus its digit sum.
 * @author Sean A. Irvine
 */
public class A048521 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = Z.ONE;

  private boolean isMoreNeeded() {
    if (mA.isEmpty()) {
      return true;
    }
    final int l = mA.first().toString().length();
    final int m = mP.toString().length();
    final int r = mP.add(9 * m).toString().length();
    return l >= r;
  }

  @Override
  public Z next() {
    // Slightly tricky to make sure we generate in order
    while (isMoreNeeded()) {
      final Z q = mP.add(ZUtils.digitSum(mP));
      if (q.isProbablePrime()) {
        mA.add(q);
      }
      mP = mP.add(1);
    }
    return mA.pollFirst();
  }
}
