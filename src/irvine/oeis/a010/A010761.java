package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010761 a(n) = floor(n/2) + floor(n/3).
 * @author Sean A. Irvine
 */
public class A010761 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2 + mN / 3);
  }
}
