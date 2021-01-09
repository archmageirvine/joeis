package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038129 Beatty sequence for cube root of 2.
 * @author Sean A. Irvine
 */
public class A038129 implements Sequence {

  private static final CR C = ComputableReals.SINGLETON.pow(CR.TWO, CR.ONE_THIRD);
  private long mN = -1;

  @Override
  public Z next() {
    return C.multiply(++mN).floor();
  }
}
