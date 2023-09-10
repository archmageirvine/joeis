package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065674.
 * @author Sean A. Irvine
 */
public class A065675 extends A065658 {

  private long mN = 0;

  private long expOf2(final Q t) {
    return t.num().makeOdd().auxiliary() - t.den().makeOdd().auxiliary();
  }

  @Override
  public Z next() {
    return Z.valueOf(expOf2(sternBrocot01Frac(++mN)));
  }
}
