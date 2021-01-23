package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024558 a(n) = [ n/{n*sqrt(6)} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024558 implements Sequence {

  private static final CR SQRT6 = CR.SIX.sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(SQRT6);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
