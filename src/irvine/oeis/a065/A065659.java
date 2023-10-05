package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065659 The table of permutations of N, each row induced by the rotation (to the left) of the n-th node in the infinite binary "decimal" fraction tree.
 * @author Sean A. Irvine
 */
public class A065659 extends A065658 {

  // Left rotation
  @Override
  protected Q rotateBinFracNodeX(final long t, final Q x) {
    final Z den = Z.ONE.shiftLeft(LongUtils.log2(t) + 1);
    final Q num = new Q(Z.valueOf(2 * t).subtract(den).add(1));
    if (x.compareTo(num.subtract(1).divide(den)) <= 0 || x.compareTo(num.add(1).divide(den)) >= 0) {
      return x;
    }
    if (x.compareTo(num.multiply(2).add(1).divide(den.multiply(2))) >= 0) {
      return num.subtract(1).divide(den).add(x.subtract(num.divide(den)).multiply(2));
    }
    if (x.compareTo(num.divide(den)) > 0) {
      return x.subtract(Q.HALF.divide(den));
    }
    return num.subtract(1).divide(den).add(x.subtract(num.subtract(1).divide(den)).divide(2));
  }
}
