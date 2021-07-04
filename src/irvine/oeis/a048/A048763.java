package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048763 Smallest cube &gt;= n.
 * @author Sean A. Irvine
 */
public class A048763 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z r = mN.root(3);
    return mN.auxiliary() == 1 ? r.pow(3) : r.add(1).pow(3);
  }
}
