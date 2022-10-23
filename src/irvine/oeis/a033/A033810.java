package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033810 Number of people needed so that probability of at least two sharing a birthday out of n possible days is at least 50%.
 * @author Sean A. Irvine
 */
public class A033810 extends Sequence1 {

  // Known to be correct for n <= 10^18

  private static final CR LN2 = CR.TWO.log();
  private static final CR LN2S = LN2.multiply(LN2);
  private static final CR LN2S2 = LN2S.multiply(2);
  private static final CR C0 = CR.THREE.subtract(LN2.multiply(2)).divide(CR.SIX);
  private static final CR C1 = CR.NINE.subtract(LN2S.multiply(4));

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = LN2.multiply(2 * ++mN).sqrt();
    final CR d = s.multiply(72);
    return s.add(C0).add(C1.divide(d)).subtract(LN2S2.divide(CR.valueOf(135 * mN))).ceil();
  }
}
