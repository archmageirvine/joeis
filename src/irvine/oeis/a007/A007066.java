package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007066.
 * @author Sean A. Irvine
 */
public class A007066 implements Sequence {

  private static final CR PHI2 = CR.PHI.multiply(CR.PHI);
  private long mN = -1;

  @Override
  public Z next() {
    return PHI2.multiply(CR.valueOf(++mN)).ceil(32).add(1);
  }
}
