package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075120 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q x = new Q(mN, Functions.SQRT.l(mN));
    long cnt = 0;
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
