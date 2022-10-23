package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001967 u-pile positions for the 4-Wythoff game with i=3.
 * @author Sean A. Irvine
 */
public class A001967 extends Sequence0 {

  private static final CR N = CR.FIVE.sqrt().subtract(CR.ONE);
  private static final CR THREE_QUARTERS = CR.THREE.divide(CR.FOUR);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(THREE_QUARTERS)).floor();
  }
}
