package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049811 a(n)=number of Farey fractions of order n that are &lt;=1/7; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049811 extends A006842 {

  private static final Q ONE_SEVENTH = new Q(1, 7);

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(ONE_SEVENTH) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
