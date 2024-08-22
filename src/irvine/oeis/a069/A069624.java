package irvine.oeis.a069;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069624 Number of different values taken by the integer part of n^(1/k) for all k &gt; 1.
 * @author Sean A. Irvine
 */
public class A069624 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final HashSet<Z> res = new HashSet<>();
    int k = 1;
    while (true) {
      final Z r = mN.root(++k);
      res.add(r);
      if (Z.ONE.equals(r)) {
        return Z.valueOf(res.size());
      }
    }
  }
}
