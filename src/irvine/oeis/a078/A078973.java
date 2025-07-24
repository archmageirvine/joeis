package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078973 Total dimension of the homology of a free 2-step nilpotent Lie algebra of rank n.
 * @author Sean A. Irvine
 */
public class A078973 extends Sequence1 {

  private int mN = 0;

  private Q f(final int n) {
    return Rationals.SINGLETON.product(1, n, k -> new Q(Functions.FACTORIAL.z(4 * k).multiply(Functions.FACTORIAL.z(k).square()), Functions.FACTORIAL.z(2 * k).pow(3)));
  }

  @Override
  public Z next() {
    ++mN;
    return f((mN - 1) / 2).multiply(f(mN / 2)).multiply(Z.TWO.pow((mN + 1) / 2)).toZ();
  }
}

