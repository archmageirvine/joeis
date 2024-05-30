package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A069976 Interior angle of a regular polygon of n sides, rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A069976 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(((++mN - 2) * 180 + mN / 2) / mN);
  }
}

