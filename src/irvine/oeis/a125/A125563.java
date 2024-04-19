package irvine.oeis.a125;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A125563 Denominator of (4n+1)!/5^n.
 * @author Georg Fischer
 */
public class A125563 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Q(Functions.FACTORIAL.z(4 * mN + 1), Z.FIVE.pow(mN)).den();
  }
}
