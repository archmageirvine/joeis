package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034886 Number of digits in n!.
 * @author Sean A. Irvine
 */
public class A034886 implements Sequence {

  private static final CR LOG10 = CR.TEN.log();
  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return CR.valueOf(mF).log().divide(LOG10).floor().add(1);
  }
}

