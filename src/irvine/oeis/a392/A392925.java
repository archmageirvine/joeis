package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A392925 allocated for Alexander Violette.
 * @author Sean A. Irvine
 */
public class A392925 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 63;
    while (true) {
      k += 2;
      if (Functions.SIGMA.z(mN, k).mod(k) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
