package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026322 |sin(2n)| &gt; |sin(n)|.
 * @author Sean A. Irvine
 */
public class A026322 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.sin(CR.valueOf(2 * mN)).abs().compareTo(ComputableReals.SINGLETON.sin(CR.valueOf(mN)).abs()) <= 0);
    return Z.valueOf(mN);
  }
}
