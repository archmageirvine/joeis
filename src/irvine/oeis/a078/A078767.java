package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a003.A003434;

/**
 * A078767 Let f(n) = A003434(n) be the number of iterations of phi needed to reach 1. Then a(n) = max(f(1), f(2), ..., f(n)).
 * @author Sean A. Irvine
 */
public class A078767 extends A003434 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.max(super.next());
    return mA;
  }
}

