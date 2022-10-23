package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049014 n plus a googol is prime.
 * @author Sean A. Irvine
 */
public class A049014 extends Sequence1 {

  private static final Z GOOGOL = Z.TEN.pow(100);
  private long mN = 266;

  @Override
  public Z next() {
    while (true) {
      if (GOOGOL.add(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
