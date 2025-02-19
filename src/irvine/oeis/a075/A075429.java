package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075429 First integer reached when starting with 1+2/(n*(n+1)) and iterating the map x -&gt; x*ceiling(x) A075428(n) times, or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A075429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q x = Q.ONE.add(new Q(2, mN * (mN + 1)));
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
    }
    return x.toZ();
  }
}
