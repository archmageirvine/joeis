package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a003.A003325;

/**
 * A085323 Numbers k such that both k and k+1 are sums of two positive cubes.
 * @author Sean A. Irvine
 */
public class A085323 extends A003325 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
