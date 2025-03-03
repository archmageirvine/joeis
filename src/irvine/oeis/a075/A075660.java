package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075660 Let f(n) = abs(lpd(n)-gpf(n)), where lpd(n) is the largest proper divisor of n and gpf(n) is the greatest prime factor of n. Sequence gives number of iterations for f(n) to reach zero.
 * @author Sean A. Irvine
 */
public class A075660 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 0) {
      m = Math.abs(m / Functions.LPF.l(m) - Functions.GPF.l(m));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
