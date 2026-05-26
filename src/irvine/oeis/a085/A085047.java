package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085047 a(n) is the least number not already used such that the arithmetic mean of the first n terms is a square.
 * @author Sean A. Irvine
 */
public class A085047 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(mN / 2).multiply(2 + 5 * (mN / 2)) : Z.valueOf((mN + 1) / 2).square();
  }
}

