package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.a001.A001248;

/**
 * A383504 allocated for Abhiram R Devesh.
 * @author Sean A. Irvine
 */
public class A383504 extends A001248 {

  @Override
  public Z next() {
    long cnt = 0;
    Z sum = Z.ZERO;
    while (!sum.isProbablePrime()) {
      sum = sum.add(super.next());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
