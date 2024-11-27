package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073407 Let phi_m(x) denote the Euler totient function applied m times to x. Sequence gives the minimum number of iterations m such that phi_m(n) divides n.
 * @author Sean A. Irvine
 */
public class A073407 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    long m = ++mN;
    do {
      m = Functions.PHI.l(m);
      ++cnt;
    } while (mN % m != 0);
    return Z.valueOf(cnt);
  }
}

