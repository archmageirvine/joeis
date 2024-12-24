package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073893 a(10k) = 0 and if n is not a multiple of 10 then a(n) is the smallest positive integer such that the concatenation of the first n terms is a multiple of n.
 * @author Sean A. Irvine
 */
public class A073893 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    long k = 0;
    long m = 10;
    while (true) {
      if (++k == m) {
        m *= 10;
        mA = mA.multiply(10);
      }
      final Z t = mA.add(k);
      if (t.mod(mN) == 0) {
        mA = t;
        return Z.valueOf(k);
      }
    }
  }
}

