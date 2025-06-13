package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.a030.A030078;

/**
 * A384161 Sum of next a(n) successive prime cubes is prime.
 * @author Sean A. Irvine
 */
public class A384161 extends A030078 {

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
