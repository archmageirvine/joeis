package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049807 a(n)=number of Farey fractions of order n that are &lt;=1/3; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049807 extends A006842 {

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(Q.ONE_THIRD) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
