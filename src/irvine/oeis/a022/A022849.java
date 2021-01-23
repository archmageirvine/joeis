package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022849 Integer nearest nx, where x = sqrt(6).
 * @author Sean A. Irvine
 */
public class A022849 implements Sequence {

  private static final CR N = CR.SIX.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(++mN).round();
  }
}
