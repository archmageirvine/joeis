package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030954 <code>[ exp(5/9)*n! ]</code>.
 * @author Sean A. Irvine
 */
public class A030954 implements Sequence {

  private static final CR EXP5_9 = CR.valueOf(new Q(5, 9)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP5_9.multiply(mF).floor();
  }
}
