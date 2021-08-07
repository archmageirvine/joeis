package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049808 a(n)=number of Farey fractions of order n that are &lt;=1/4; cf. A049805.
 * @author Sean A. Irvine
 */
public class A049808 extends A006842 {

  @Override
  public Z next() {
    super.step();
    int k = mTerms.size() - 1;
    while (mTerms.get(k).compareTo(Q.ONE_QUARTER) > 0) {
      --k;
    }
    return Z.valueOf(k + 1);
  }
}
