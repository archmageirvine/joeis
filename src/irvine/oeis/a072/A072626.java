package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072626 Parity of floor(n/log(n)).
 * @author Sean A. Irvine
 */
public class A072626 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log()).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
