package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057900 Numbers n such that 3^n + n is prime.
 * @author Sean A. Irvine
 */
public class A057900 implements Sequence {

  private Z mA = Z.THREE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(3);
      if (mA.add(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

