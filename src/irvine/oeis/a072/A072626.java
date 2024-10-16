package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072607.
 * @author Sean A. Irvine
 */
public class A072626 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log()).floor().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
