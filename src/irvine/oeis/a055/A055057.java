package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055057 Largest k value that admits an (n,k) smooth magic carpet.
 * @author Sean A. Irvine
 */
public class A055057 extends A055056 {

  @Override
  public Z next() {
    ++mN;
    int max = 0;
    for (int m = 3; m <= LARGEST_K[mN]; ++m) {
      if (b(mN, m) > 0) {
        max = m;
      }
    }
    return Z.valueOf(max);
  }
}
