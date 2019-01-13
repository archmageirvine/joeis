package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A009843.
 * @author Sean A. Irvine
 */
public class A009843 extends A000364 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return super.next().multiply(mN);
  }
}
