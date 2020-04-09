package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030800.
 * @author Sean A. Irvine
 */
public class A030800 implements Sequence {

  private static final CR EXP19_24 = CR.valueOf(new Q(19, 24)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP19_24.multiply(mF).floor();
  }
}
