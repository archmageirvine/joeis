package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073538 Let c(0)=n&gt;=2 and c(k+1) = floor(3*c(k)/2); then a(n) is the smallest value such that c(a(n)) is prime.
 * @author Sean A. Irvine
 */
public class A073538 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z c = Z.valueOf(++mN);
    long cnt = 0;
    while (!c.isProbablePrime()) {
      c = c.multiply(3).divide2();
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
