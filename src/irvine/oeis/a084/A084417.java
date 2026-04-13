package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084417 Triangle read by rows: T(n,k)=sum((n+1-i)!*stirling2(n,n+1-i),i=1..k), n&gt;=1, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A084417 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(1, mM, k -> Functions.STIRLING2.z(mN, mN + 1 - k).multiply(Functions.FACTORIAL.z(mN + 1 - k)));
  }
}
