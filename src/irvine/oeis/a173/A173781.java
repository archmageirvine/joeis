package irvine.oeis.a173;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A173781 a(n) is the smallest entry of the n-th column of the matrix of Super Catalan numbers S(m,n).
 * @author Sean A. Irvine
 */
public class A173781 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int m = (++mN + 2) / 3;
    return Functions.FACTORIAL.z(2 * mN).divide(Functions.FACTORIAL.z(mN)).multiply(Functions.FACTORIAL.z(2 * m).divide(Functions.FACTORIAL.z(m))).divide(Functions.FACTORIAL.z(mN + m));
  }
}

