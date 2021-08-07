package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049814 a(n)=number of Farey fractions of order n that are &lt;=1/10; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049814 extends A006842 {

  private static final Q ONE_TENTH = new Q(1, 10);

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(ONE_TENTH) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
