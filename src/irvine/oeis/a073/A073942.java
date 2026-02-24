package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002977;

/**
 * A073942 Numbers k such that A002977(k) - A002977(k-1) = 1.
 * @author Sean A. Irvine
 */
public class A073942 extends A002977 {

  private Z mA = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}

