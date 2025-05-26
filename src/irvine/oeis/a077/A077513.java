package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077513 Smallest n-digit squarefree number beginning with n.
 * @author Sean A. Irvine
 */
public class A077513 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    while (sb.length() < mN) {
      sb.append(0);
    }
    Z s = new Z(sb);
    while (!Predicates.SQUARE_FREE.is(s)) {
      s = s.add(1);
    }
    return s;
  }
}
