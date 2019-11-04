package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022851 <code>a(n) =</code> integer nearest <code>nx</code>, where <code>x = sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A022851 implements Sequence {

  private static final CR N = CR.valueOf(8).sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(++mN).round();
  }
}
