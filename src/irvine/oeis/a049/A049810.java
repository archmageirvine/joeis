package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049810 a(n)=number of Farey fractions of order n that are &lt;=1/6; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049810 extends A006842 {

  private static final Q ONE_SIXTH = new Q(1, 6);

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(ONE_SIXTH) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
