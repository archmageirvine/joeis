package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080758 Number of steps needed to reach a prime starting with n and iterating x--&gt;floor(3x/2).
 * @author Sean A. Irvine
 */
public class A080758 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    do {
      m = m.multiply(3).divide2();
      ++cnt;
    } while (!m.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
