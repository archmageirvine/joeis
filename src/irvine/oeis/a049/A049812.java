package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049812 a(n)=number of Farey fractions of order n that are &lt;=1/8; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049812 extends A006842 {

  private static final Q ONE_EIGHTH = new Q(1, 8);

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(ONE_EIGHTH) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
