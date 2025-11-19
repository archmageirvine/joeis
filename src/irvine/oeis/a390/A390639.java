package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390421.
 * @author Sean A. Irvine
 */
public class A390639 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Functions.SOPFR.z(mN).multiply2().add(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
