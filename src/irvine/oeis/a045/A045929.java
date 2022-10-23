package irvine.oeis.a045;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045929 Generalized Connell sequence C_{5,3}.
 * @author Sean A. Irvine
 */
public class A045929 extends Sequence1 {

  private static final CR R6 = CR.SIX;
  private static final CR R7 = CR.SEVEN;
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(5 * ++mN - 4 * CR.valueOf(24 * mN - 23).sqrt().add(R7).divide(R6).floor().longValueExact());
  }
}
