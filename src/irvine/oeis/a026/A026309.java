package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026309 a(n) = n-th nonnegative integer k satisfying sin(k) &lt; sin(k+1).
 * @author Sean A. Irvine
 */
public class A026309 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.sin(CR.valueOf(mN)).compareTo(ComputableReals.SINGLETON.sin(CR.valueOf(mN + 1))) >= 0);
    return Z.valueOf(mN);
  }
}
