package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008469 a(n) = n OR n^3 (applied to ternary expansions).
 * @author Sean A. Irvine
 */
public class A008469 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final String n = mN.toString(3);
    final String s = mN.pow(3).toString(3);
    return new Z(A008467.ternaryOr(n, s), 3);
  }
}
