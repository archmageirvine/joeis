package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003306 Numbers n such that 2*3^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A003306 implements Sequence {

  private Z mT = null;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT == null ? Z.ONE : mT.multiply(3);
      if (mT.multiply2().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }

}
