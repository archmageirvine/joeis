package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058289 Integer nearest 10^n/(log(10^n) - 1.08366).
 * @author Sean A. Irvine
 */
public class A058289 implements Sequence {

  private static final CR C = CR.valueOf(new Q(108366, 100000));
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    final CR t = CR.valueOf(mA);
    return t.divide(t.log().subtract(C)).round();
  }
}
