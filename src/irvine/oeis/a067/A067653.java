package irvine.oeis.a067;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067653 Denominators of the coefficients in exp(x/(1-x)) power series.
 * @author Sean A. Irvine
 */
public class A067653 extends Sequence0 {

  private final List<Q> mA = new ArrayList<>();
  private int mN = -1;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    final Q res;
    if (++mN == 0) {
      res = Q.ONE;
    } else {
      res = Rationals.SINGLETON.sum(0, mN - 1, k -> mA.get(k).multiply(mN - k)).divide(mN);
    }
    mA.add(res);
    return select(res);
  }
}
