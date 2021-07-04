package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048762 Largest cube &lt;= n.
 * @author Sean A. Irvine
 */
public class A048762 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.root(3).pow(3);
  }
}
