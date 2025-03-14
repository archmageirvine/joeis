package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075999 Product{[n/k + 1/2]: k=1,2,...,n}, where [x + 1/2] denotes the integer nearest to x.
 * @author Sean A. Irvine
 */
public class A075999 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, mN, k -> new Q(mN, k).round());
  }
}
