package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008469 <code>a(n) = n</code> OR <code>n^3</code> (applied to ternary expansions).
 * @author Sean A. Irvine
 */
public class A008469 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final String n = mN.toString(3);
    final String s = mN.pow(3).toString(3);
    return new Z(A008467.ternaryOr(n, s), 3);
  }
}
