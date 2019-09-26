package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026316 Numbers n such that <code>|sin(n)| &gt; |cos(n+1)|</code>.
 * @author Sean A. Irvine
 */
public class A026316 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.sin(CR.valueOf(mN)).abs().compareTo(ComputableReals.SINGLETON.cos(CR.valueOf(mN + 1)).abs()) <= 0);
    return Z.valueOf(mN);
  }
}
