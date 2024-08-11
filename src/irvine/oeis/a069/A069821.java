package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069821 a(n) is the smallest k &gt; n such that (k^3 - 1)/(n^3 - 1) is an integer.
 * @author Sean A. Irvine
 */
public class A069821 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.valueOf(mN).pow(3).subtract(1);
    long k = mN;
    while (true) {
      if (Z.valueOf(++k).pow(3).subtract(1).mod(t).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

