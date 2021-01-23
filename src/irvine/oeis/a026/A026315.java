package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026315 |sin(n)| &lt; |sin(n+1)|.
 * @author Sean A. Irvine
 */
public class A026315 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.sin(CR.valueOf(mN)).abs().compareTo(ComputableReals.SINGLETON.sin(CR.valueOf(mN + 1)).abs()) >= 0);
    return Z.valueOf(mN);
  }
}
