package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067228 Number of rectangular standard Young tableaux with n cells.
 * @author Sean A. Irvine
 */
public class A067228 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final Z nf = Functions.FACTORIAL.z(n);
    return Integers.SINGLETON.sumdiv(mN, d -> Rationals.SINGLETON.product(0, mN / d - 1, k -> new Q(Functions.FACTORIAL.z(k), Functions.FACTORIAL.z(d + k))).multiply(nf).toZ());
  }
}

