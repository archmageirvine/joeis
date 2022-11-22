package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060449 Generalized Mills numbers: a(n) = floor(c^(b^n)) where c=4.4, b=1.179.
 * @author Sean A. Irvine
 */
public class A060449 extends Sequence1 {

  private static final CR B = CR.valueOf(new Q(1179, 1000));
  private static final CR C = CR.valueOf(new Q(44, 10));
  private long mN = 0;

  @Override
  public Z next() {
    return C.pow(B.pow(++mN)).floor();
  }
}
