package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080525 First column of triangle in A080524.
 * @author Sean A. Irvine
 */
public class A080525 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).add((2 - mN - 1) / ((mN & 1) + 1));
  }
}

