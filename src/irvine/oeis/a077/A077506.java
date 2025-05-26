package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077506 Smallest n-digit triangular number beginning with n.
 * @author Sean A. Irvine
 */
public class A077506 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    while (sb.length() < mN) {
      sb.append(0);
    }
    final Z s = new Z(sb);
    final Z inv = Functions.TRINV.z(s);
    final Z t = Functions.TRIANGULAR.z(inv);
    return t.compareTo(s) < 0 ? Functions.TRIANGULAR.z(inv.add(1)) : t;
  }
}
