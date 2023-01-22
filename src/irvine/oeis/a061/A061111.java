package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061111 a(1) = 1; a(n) = smallest number such that the concatenation a(1).0^*.a(2).0^*....0^*.a(n) is a perfect cube (where any number of 0's can be inserted between the terms).
 * @author Sean A. Irvine
 */
public class A061111 extends Sequence1 {

  private Z mC = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z t = A061109.f(3, mC);
    mC = new Z(mC.toString() + t);
    return t;
  }
}
