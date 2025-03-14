package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075998 Product{&lt;n/k&gt;: k=1,2,...,n}, where &lt;x&gt; denotes the integer second nearest to x. (For x=(2h+1)/2, &lt;x&gt; is defined to be h, not h+1; if x is an integer, then &lt;x&gt; is defined to be x+1.).
 * @author Sean A. Irvine
 */
public class A075998 extends Sequence1 {

  private int mN = 0;

  private Z bracket(final Q x) {
    return x.floor().multiply2().subtract(x.add(Q.HALF).floor()).add(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.product(1, mN, k -> bracket(new Q(mN, k)));
  }
}
