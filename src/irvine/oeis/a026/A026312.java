package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026312 n-th nonnegative integer k satisfying cos(k) &gt; sin(k+1).
 * @author Sean A. Irvine
 */
public class A026312 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.cos(CR.valueOf(mN)).compareTo(ComputableReals.SINGLETON.sin(CR.valueOf(mN + 1))) <= 0);
    return Z.valueOf(mN);
  }
}
