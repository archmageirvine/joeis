package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030940 [ exp(8/11)*n! ].
 * @author Sean A. Irvine
 */
public class A030940 implements Sequence {

  private static final CR EXP8_11 = CR.valueOf(new Q(8, 11)).exp();
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return EXP8_11.multiply(mF).floor();
  }
}
