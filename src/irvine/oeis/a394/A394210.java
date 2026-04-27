package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394210 a(n) is the least k &gt; 1 such that gpf(2^n*k) &gt; gpf(2^n*k-1) where gpf is the greatest prime factor (A006530).
 * @author Sean A. Irvine
 */
public class A394210 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).shiftLeft(mN);
      if (Functions.GPF.z(t).compareTo(Functions.GPF.z(t.subtract(1))) > 0) {
        //return t;
        return Z.valueOf(k);
      }
    }
  }
}
