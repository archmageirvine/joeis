package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q x = Q.ONE.add(new Q(2, mN * (mN + 1)));
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
    }
    return x.toZ();
  }
}
