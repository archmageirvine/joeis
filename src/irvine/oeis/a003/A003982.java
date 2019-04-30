package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003982 Table read by rows: 1 if <code>x = y, 0</code> otherwise, where <code>(x,y) = (0,0),(0,1),(1,0),(0,2),(1,1),(2,0),</code>...
 * @author Sean A. Irvine
 */
public class A003982 implements Sequence {

  private long mN = 0;
  private long mZeros = 0;

  @Override
  public Z next() {
    if (--mZeros < 0) {
      ++mN;
      mZeros = 4 * mN - 1;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}
