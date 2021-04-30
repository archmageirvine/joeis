package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046868 Numbers n such that prime(n)^2 &gt; prime(n-1)*prime(n+1).
 * @author Sean A. Irvine
 */
public class A046868 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = mA;
      mA = mB;
      mB = super.next();
      if (mA.square().compareTo(p.multiply(mB)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
