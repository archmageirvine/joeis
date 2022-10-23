package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057755 Number of digits in n-th Fermat number (A000215).
 * @author Sean A. Irvine
 */
public class A057755 extends Sequence0 {

  private static final CR LOG2_10 = CR.TWO.log().divide(CR.TEN.log());
  private int mN = -1;

  @Override
  public Z next() {
    return LOG2_10.multiply(Z.ONE.shiftLeft(++mN)).add(CR.ONE).floor();
  }
}

