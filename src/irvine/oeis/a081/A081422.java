package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081422 Triangle read by rows in which row n consists of the first n+1 n-gonal numbers.
 * @author Sean A. Irvine
 */
public class A081422 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mN - 2).multiply(mM + 1).subtract(mN - 4).multiply(mM + 1).divide2();
  }
}

