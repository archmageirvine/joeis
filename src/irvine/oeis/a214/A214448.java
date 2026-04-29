package irvine.oeis.a214;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A214049 Least m&gt;0 such that n! &lt;= m^3.
 * @author Sean A. Irvine
 */
public class A214448 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z s = Functions.FACTORIAL.z(++mN).root(4);
    return s.auxiliary() == 1 ? s : s.add(1);
  }
}
