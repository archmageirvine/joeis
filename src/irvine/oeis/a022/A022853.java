package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022853 a(n) = integer nearest n*Pi.
 * @author Sean A. Irvine
 */
public class A022853 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PI.multiply(++mN).round();
  }
}
