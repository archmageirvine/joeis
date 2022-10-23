package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022851 a(n) = integer nearest n*x, where x = sqrt(8).
 * @author Sean A. Irvine
 */
public class A022851 extends Sequence0 {

  private static final CR N = CR.EIGHT.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(++mN).round();
  }
}
