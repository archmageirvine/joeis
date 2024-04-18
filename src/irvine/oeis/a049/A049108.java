package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049108 a(n) is the number of iterations of Euler phi function needed to reach 1 starting at n (n is counted).
 * @author Sean A. Irvine
 */
public class A049108 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 1;
    long n = ++mN;
    while (n != 1) {
      n = Functions.PHI.l(n);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

