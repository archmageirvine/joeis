package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050811 Partition numbers rounded to nearest integer given by the Hardy-Ramanujan approximate formula.
 * @author Sean A. Irvine
 */
public class A050811 extends Sequence1 {

  private static final CR FOUR_SQRT_3 = CR.valueOf(48).sqrt();
  private static final CR C = CR.PI.multiply(CR.TWO.divide(CR.THREE).sqrt());
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.sqrt().multiply(C).exp().divide(n.multiply(FOUR_SQRT_3)).round();
  }
}
