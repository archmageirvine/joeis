package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030802 <code>a(n) = floor( exp(13/24)*n! )</code>.
 * @author Sean A. Irvine
 */
public class A030802 implements Sequence {

  private static final CR EXP13_24 = CR.valueOf(new Q(13, 24)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP13_24.multiply(mF).floor();
  }
}
