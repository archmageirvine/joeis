package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024543.
 * @author Sean A. Irvine
 */
public class A024543 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.divide(CR.SQRT2);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
