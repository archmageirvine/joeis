package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099552 a(n) is the smallest positive integer such that the concatenation of the first n terms is divisible by n.
 * @author Sean A. Irvine
 */
public class A099552 extends Sequence1 {

  protected Z mA = Z.ZERO;
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long lim = 1;
    while (true) {
      if (++k == lim) {
        lim *= 10;
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

