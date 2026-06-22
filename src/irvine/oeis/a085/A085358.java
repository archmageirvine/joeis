package irvine.oeis.a085;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085358 Runs of zeros in binomial(3k,k)/(2k+1) (mod 2): relates ternary trees (A001764) to the infinite Fibonacci word (A003849).
 * @author Sean A. Irvine
 */
public class A085358 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    while (Binomial.binomial(3 * ++mN, mN, 2) != 0) {
      // do nothing
    }
    long cnt = 1;
    while (Binomial.binomial(3 * ++mN, mN, 2) == 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
