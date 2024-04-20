package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057237 Maximum k &lt;= n such that 1, 2, ..., k are all relatively prime to n.
 * @author Sean A. Irvine
 */
public class A057237 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Functions.LPF.z(mN).subtract(1);
  }
}
