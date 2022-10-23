package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048861 a(n) = n^n - 1.
 * @author Sean A. Irvine
 */
public class A048861 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).subtract(1);
  }
}
