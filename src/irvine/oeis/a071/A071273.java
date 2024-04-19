package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071273 Concatenation of R(n) (A004086) and n, omitting leading 0's.
 * @author Georg Fischer
 */
public class A071273 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String sn = String.valueOf(++mN);
    return new Z(new StringBuilder(sn).reverse() + sn);
  }
}
