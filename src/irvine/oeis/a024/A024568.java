package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024568 <code>a(n) = [ n/{n*r} ]</code>, where r <code>= (1 + sqrt(5))/2</code> and <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024568 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(CR.PHI);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
