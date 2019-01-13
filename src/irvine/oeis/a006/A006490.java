package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006490.
 * @author Sean A. Irvine
 */
public class A006490 extends A000045 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : super.next().multiply(mN);
  }
}

