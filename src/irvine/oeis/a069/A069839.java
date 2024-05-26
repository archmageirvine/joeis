package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069839 Number of different (unlabeled) 2-cell embeddings of the complete graph K_n on n vertices into orientable surfaces.
 * @author Sean A. Irvine
 */
public class A069839 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    final Z f = Functions.FACTORIAL.z(mN - 2);
    return Rationals.SINGLETON.sumdiv(mN, d -> new Q(f.pow(mN / d), Z.valueOf(d).pow(mN / d).multiply(Functions.FACTORIAL.z(mN / d))))
      .add(new Q(Integers.SINGLETON.sumdiv(mN - 1, d -> d == 1 ? Z.ZERO : Functions.PHI.z(d).multiply(f.pow((mN - 1) / d))), mN - 1))
      .toZ();
  }
}

