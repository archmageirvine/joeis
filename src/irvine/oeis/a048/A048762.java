package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048762 Largest cube &lt;= n.
 * @author Sean A. Irvine
 */
public class A048762 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.root(3).pow(3);
  }
}
