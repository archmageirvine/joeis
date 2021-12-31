package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001966 v-pile counts for the 4-Wythoff game with i=2.
 * @author Sean A. Irvine
 */
public class A001966 implements Sequence {

  private static final CR N = CR.FIVE.sqrt().add(CR.THREE);
  private long mN = -1;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(++mN).add(CR.HALF)).floor();
  }
}
