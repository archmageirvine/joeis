package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001964 v-pile positions of the 4-Wythoff game with i=1.
 * @author Sean A. Irvine
 */
public class A001964 extends Sequence0 {

  private static final CR N = CR.FIVE.sqrt().add(CR.THREE);
  private static final CR QUARTER = CR.FOUR.inverse();
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(QUARTER)).floor();
  }
}
