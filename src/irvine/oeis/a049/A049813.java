package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049813 a(n)=number of Farey fractions of order n that are &lt;=1/9; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049813 extends A006842 {

  private static final Q ONE_NINTH = new Q(1, 9);

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(ONE_NINTH) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
