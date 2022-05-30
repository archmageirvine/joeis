package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057237 Maximum k &lt;= n such that 1, 2, ..., k are all relatively prime to n.
 * @author Sean A. Irvine
 */
public class A057237 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Jaguar.factor(mN).leastPrimeFactor().subtract(1);
  }
}
