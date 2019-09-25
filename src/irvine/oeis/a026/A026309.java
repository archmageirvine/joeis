package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026309 <code>a(n) = n-th</code> nonnegative integer k satisfying <code>sin(k) &lt; sin(k+1)</code>.
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
