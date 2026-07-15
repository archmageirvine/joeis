package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085874 a(1) = 2, a(n)= smallest prime of the form k*a(n-1) - 1 where k itself is a multiple of n.
 * @author Sean A. Irvine
 */
public class A085874 extends Sequence1 {

  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA.multiply(++mN);
    Z s = Z.NEG_ONE;
    while (true) {
      s = s.add(t);
      if (s.isProbablePrime()) {
        mA = s;
        return s;
      }
    }
  }
}
