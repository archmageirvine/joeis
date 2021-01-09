package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038128 Beatty sequence for Euler's constant (A001620).
 * @author Sean A. Irvine
 */
public class A038128 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.GAMMA.multiply(++mN).floor();
  }
}
