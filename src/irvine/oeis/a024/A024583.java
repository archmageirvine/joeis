package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024583 a(n) = [ n/{n*pi} ], {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024583 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(CR.PI);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
