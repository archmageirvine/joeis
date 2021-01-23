package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024572 a(n) = [ n/{n*e} ], {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024572 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(CR.E);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
