package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A073500 Numbers n such that sigma(n) = sigma(n+1)+sigma(n-1).
 * @author Sean A. Irvine
 */
public class A073500 extends A000203 {

  private long mN = 1;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mA.equals(t.add(mB))) {
        return Z.valueOf(mN);
      }
    }
  }
}
