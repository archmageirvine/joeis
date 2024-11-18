package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073132 Smallest subscript j such that d=p[p(j+1)]-p[p(j)]=2n, or 0 if j does not exist (at d=4).
 * @author Sean A. Irvine
 */
public class A073132 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    final long m = 2 * mN;
    long j = 0;
    while (true) {
      if (Functions.PRIME.l(Functions.PRIME.l(++j + 1)) - Functions.PRIME.l(Functions.PRIME.l(j)) == m) {
        return Z.valueOf(j);
      }
    }
  }
}
