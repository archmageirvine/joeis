package irvine.oeis.a007;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007905.
 * @author Sean A. Irvine
 */
public class A007905 extends MemoryFunction1<Q> implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  protected Q compute(final int n) {
    return n <= 1 ? Q.ZERO : get(n / 2).add(get((n - 1) / 2)).add(new Q(n - 1, n));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return get(mN).multiply(mF).toZ();
  }
}

