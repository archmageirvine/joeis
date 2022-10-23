package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052210 Numbers n such that n^3 starts with n itself (in base 10).
 * @author Sean A. Irvine
 */
public class A052210 extends Sequence1 {

  // After Arkadiusz Wesolowski

  private int mN = -1;

  protected int power() {
    return 3;
  }

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    } else if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    final int e = power();
    while (true) {
      final Z p = CR.TEN.pow(CR.valueOf(e - 1).inverse()).pow(++mN).round();
      final Z f = p.pow(e);
      if (f.toString().startsWith(p.toString())) {
        return p;
      }
    }
  }
}
