package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061110 a(1) = 1; a(n) = smallest number such that the concatenation a(1)a(2)...a(n) is a square.
 * @author Sean A. Irvine
 */
public class A061110 extends Sequence1 {

  private Z mC = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z t = A061109.f(2, mC);
    mC = new Z(mC.toString() + t);
    return t;
  }
}
