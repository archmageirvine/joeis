package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026317 Nonnegative integers k such that <code>|cos(k)| &gt; |sin(k+1)|</code>.
 * @author Sean A. Irvine
 */
public class A026317 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.cos(CR.valueOf(mN)).abs().compareTo(ComputableReals.SINGLETON.sin(CR.valueOf(mN + 1)).abs()) <= 0);
    return Z.valueOf(mN);
  }
}
