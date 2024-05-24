package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069820 (a(n)^2-1)/(n^2-1) is the smallest integer&gt;1.
 * @author Sean A. Irvine
 */
public class A069820 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.valueOf(mN).square().subtract(1);
    long k = mN;
    while (true) {
      if (Z.valueOf(++k).square().subtract(1).mod(t).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

