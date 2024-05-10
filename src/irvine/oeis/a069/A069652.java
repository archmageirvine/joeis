package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A066151.
 * @author Sean A. Irvine
 */
public class A069652 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Permutation perm = Permutation.permuter(mN);
    Z g = Permutation.permToZ(perm.next());
    int[] p;
    while (!Z.ONE.equals(g) && (p = perm.next()) != null) {
      g = g.gcd(Permutation.permToZ(p));
    }
    return g;
  }
}
