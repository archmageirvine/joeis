package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077507 Largest n-digit triangular number beginning with n.
 * @author Sean A. Irvine
 */
public class A077507 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    while (sb.length() < mN) {
      sb.append(9);
    }
    return Functions.TRIANGULAR.z(Functions.TRINV.z(new Z(sb)));
  }
}
