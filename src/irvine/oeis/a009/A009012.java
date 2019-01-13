package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a056.A056137;

/**
 * A009012.
 * @author Sean A. Irvine
 */
public class A009012 extends A056137 {

  private long mC = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      mC = super.next().longValueExact();
      ++mN;
    }
    --mC;
    return Z.valueOf(mN);
  }
}
