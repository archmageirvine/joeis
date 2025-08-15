package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079464 Numbers k such that the "inventory" A063850 of k is prime.
 * @author Sean A. Irvine
 */
public class A079464 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.INVENTORY.z(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
