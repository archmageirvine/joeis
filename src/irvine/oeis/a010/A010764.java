package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A010764 a(n) = floor(n/2) mod floor(n/3).
 * @author Sean A. Irvine
 */
public class A010764 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf((mN / 2) % (mN / 3));
  }
}
