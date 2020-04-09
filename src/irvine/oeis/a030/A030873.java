package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030873 <code>[ exp(5/19)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030873 implements Sequence {

  private static final CR EXP5_19 = CR.valueOf(new Q(5, 19)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_19.multiply(mF).floor();
  }
}
