package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014641 Odd octagonal numbers: (2n+1)*(6n+1).
 * @author Sean A. Irvine
 */
public class A014641 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN + 1).multiply(6 * mN + 1);
  }
}
