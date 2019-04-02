package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001960 Wythoff game.
 * @author Sean A. Irvine
 */
public class A001960 implements Sequence {

  private static final CR N = CR.valueOf(13).sqrt().add(CR.FIVE).divide(CR.TWO);
  private static final CR TWO_THIRDS = CR.TWO.divide(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(TWO_THIRDS)).floor(32);
  }
}
