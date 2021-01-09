package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038130 Beatty sequence for 2*Pi.
 * @author Sean A. Irvine
 */
public class A038130 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.TAU.multiply(++mN).floor();
  }
}
