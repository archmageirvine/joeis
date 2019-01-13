package irvine.oeis.a005;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005803.
 * @author Sean A. Irvine
 */
public class A005803 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.valueOf(-mN);
    }
    return Eulerian2.SINGLETON.get(mN, 1L);
  }
}
