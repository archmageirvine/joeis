package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022851 a(n) = integer nearest nx, where x = sqrt(8).
 * @author Sean A. Irvine
 */
public class A022851 implements Sequence {

  private static final CR N = CR.EIGHT.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(++mN).round();
  }
}
