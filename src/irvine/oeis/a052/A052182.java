package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052182 Determinant of n X n matrix whose rows are cyclic permutations of 1..n.
 * @author Sean A. Irvine
 */
public class A052182 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z t = n.pow(mN - 2).multiply(n.square().add(n)).divide2();
    return (mN & 1) == 0 ? t.negate() : t;
  }
}

