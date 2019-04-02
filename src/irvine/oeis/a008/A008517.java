package irvine.oeis.a008;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008517 Second-order Eulerian triangle T(n,k), 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A008517 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Eulerian2.SINGLETON.get(mN, mM);
  }
}

