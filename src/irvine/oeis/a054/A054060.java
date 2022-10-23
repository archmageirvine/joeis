package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054060 Least k for which the integers floor(k*(Pi/2 - arctan(m))) for m=1,2,...,n are distinct.
 * @author Sean A. Irvine
 */
public class A054060 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    final TreeSet<Z> seen = new TreeSet<>();
    while (true) {
      seen.clear();
      ++k;
      for (long m = 1; m <= mN; ++m) {
        if (!seen.add(CR.HALF_PI.subtract(ComputableReals.SINGLETON.atan(CR.valueOf(m))).multiply(k).floor())) {
          break;
        }
      }
      if (seen.size() == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
