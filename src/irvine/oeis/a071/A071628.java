package irvine.oeis.a071;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071628 Smallest m such that (2n-1)*2^m is totient, that is, in A002202, or -1 if (2n-1)*2^m is never a totient.
 * @author Sean A. Irvine
 */
public class A071628 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z t = Z.valueOf(mN);
    long m = 0;
    while (true) {
      t = t.multiply2();
      ++m;
      if (!InverseEuler.inversePhi(t).isEmpty()) {
        return Z.valueOf(m);
      }
    }
  }
}
