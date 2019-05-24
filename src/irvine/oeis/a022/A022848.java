package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022848 Integer nearest <code>nx</code>, where <code>x = sqrt(5)</code>.
 * @author Sean A. Irvine
 */
public class A022848 implements Sequence {

  private static final CR N = CR.FIVE.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN)).round();
  }
}
