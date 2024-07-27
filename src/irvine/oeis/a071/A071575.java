package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071575 Number of iterations of cototient(n) needed to reach 1 (cototient(n) = n-phi(n)).
 * @author Sean A. Irvine
 */
public class A071575 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 1) {
      ++cnt;
      m = Functions.COTOTIENT.l(m);
    }
    return Z.valueOf(cnt);
  }
}

