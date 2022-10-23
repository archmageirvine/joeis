package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001959 u-pile numbers for the 3-Wythoff game with i=2.
 * @author Sean A. Irvine
 */
public class A001959 extends Sequence0 {

  private static final CR N = CR.valueOf(13).sqrt().subtract(CR.ONE).divide(CR.TWO);
  private static final CR TWO_THIRDS = CR.TWO.divide(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(TWO_THIRDS)).floor();
  }
}
