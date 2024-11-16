package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073108 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 0;
    final Z n2 = Z.valueOf(mN * mN);
    while (true) {
      ++k;
      if (n2.add(k * k).isProbablePrime() && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
