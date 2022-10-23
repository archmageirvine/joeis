package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001704 a(n) = n concatenated with n + 1.
 * @author Sean A. Irvine
 */
public class A001704 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Z(String.valueOf(mN) + String.valueOf(mN + 1));
  }
}
