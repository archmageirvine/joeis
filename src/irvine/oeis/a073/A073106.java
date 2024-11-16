package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073106 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 0;
    Z a = Z.ONE;
    while (true) {
      ++k;
      a = a.add(2 * mN);
      if (a.isProbablePrime() && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
