package irvine.oeis.a339;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A339276 Nearest integer to the fourth root of n.
 * @author Georg Fischer
 */
public class A339276 extends Sequence1 {

  private int mN = 0;
  private static final CR FOURTH = CR.FOUR.inverse();

  @Override
  public Z next() {
    ++mN;
    return CR.valueOf(mN).pow(FOURTH).round();
  }
}
