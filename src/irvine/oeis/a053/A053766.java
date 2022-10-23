package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053766 a(n) = 5^(n^2 - n).
 * @author Sean A. Irvine
 */
public class A053766 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.FIVE.pow(++mN * mN - mN);
  }
}
