package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073083.
 * @author Sean A. Irvine
 */
public class A073105 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    long cnt = 0;
    long k = 0;
    Z a = Z.ONE;
    while (true) {
      ++k;
      a = a.add(t);
      if (a.isProbablePrime() && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
