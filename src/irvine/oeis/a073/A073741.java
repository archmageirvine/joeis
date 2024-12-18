package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073741 Number of steps needed to reach a prime when the following map is repeatedly applied to n: if n is even then 2n+1, otherwise 2n-1; or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A073741 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    do {
      m = m.multiply2().signedAdd(m.isEven(), Z.ONE);
      ++cnt;
    } while (!m.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
