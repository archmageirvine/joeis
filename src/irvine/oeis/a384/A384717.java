package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384717 Sum of floored squared chord lengths from -1 to the 2n-th roots of unity (upper semicircle, endpoints excluded).
 * @author Sean A. Irvine
 */
public class A384717 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2 + mN / 3 + 2 * mN / 3);
  }
}

