package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a144.A144248;

/**
 * A076724 Numbers m such that abs(Sum {k = 1..m} tau(k)) is a prime, where tau is the Ramanujan tau function (A000594).
 * @author Sean A. Irvine
 */
public class A076724 extends A144248 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
