package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076980 Leyland numbers: 3, together with numbers expressible as n^k + k^n nontrivially, i.e., n,k &gt; 1 (to avoid n = (n-1)^1 + 1^(n-1)).
 * @author Sean A. Irvine
 */
public class A076980 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.THREE);
  }
  private long mN = 2;
  private Z mS = Z.FOUR;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first().compareTo(mS) >= 0) {
      final Z n = Z.valueOf(mN);
      for (long k = 2; k <= mN; ++k) {
        mA.add(n.pow(k).add(Z.valueOf(k).pow(mN)));
      }
      ++mN;
      mS = Z.valueOf(mN).square();
    }
    return mA.pollFirst();
  }
}

