package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A052862 Expansion of e.g.f. log(-1/(-2+exp(x)))*x.
 * @author Sean A. Irvine
 */
public class A052862 extends A000670 {

  private int mFirst = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (mFirst <= 2) {
      return ++mFirst == 3 ? Z.TWO : Z.ZERO;
    }
    return super.next().multiply(2L * mN + 4);
  }
}

