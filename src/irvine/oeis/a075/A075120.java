package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075120 Number of steps to reach the first integer (= A075121(n)) starting with n/floor(sqrt(n)) and iterating the map x -&gt; x*ceiling(x), or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A075120 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q x = new Q(mN, Functions.SQRT.l(mN));
    long cnt = 0;
    while (!x.isInteger()) {
      x = x.multiply(x.ceiling());
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
