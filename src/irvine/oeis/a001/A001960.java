package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001960 a(n) = floor((n+2/3)*(5+sqrt(13))/2); v-pile positions in the 3-Wythoff game.
 * @author Sean A. Irvine
 */
public class A001960 extends Sequence0 {

  private static final CR N = CR.valueOf(13).sqrt().add(CR.FIVE).divide(CR.TWO);
  private static final CR TWO_THIRDS = CR.TWO.divide(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(TWO_THIRDS)).floor();
  }
}
