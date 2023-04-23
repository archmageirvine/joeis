package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063377 Sophie Germain degree of n: number of iterations of n under f(k) = 2k+1 before we reach a number that is not a prime.
 * @author Sean A. Irvine
 */
public class A063377 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    long cnt = 0;
    while (n.isProbablePrime()) {
      n = n.multiply2().add(1);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
