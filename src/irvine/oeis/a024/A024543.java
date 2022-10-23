package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024543 [ n/{n/sqrt(2)} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024543 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.divide(CR.SQRT2);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
