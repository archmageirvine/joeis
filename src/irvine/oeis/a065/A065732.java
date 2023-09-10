package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065732 Largest square &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A065732 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).sqrt().square();
  }
}
