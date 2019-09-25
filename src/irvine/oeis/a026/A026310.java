package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026310.
 * @author Sean A. Irvine
 */
public class A026310 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (ComputableReals.SINGLETON.sin(CR.valueOf(mN)).compareTo(ComputableReals.SINGLETON.cos(CR.valueOf(mN + 1))) <= 0);
    return Z.valueOf(mN);
  }
}
