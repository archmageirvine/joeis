package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058009 a(n) is obtained by applying the map k -&gt; prime(k) n times, starting at n.
 * @author Sean A. Irvine
 */
public class A058009 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long t = ++mN;
    for (int k = 0; k < mN; ++k) {
      t = Functions.PRIME.l(t);
    }
    return Z.valueOf(t);
  }
}
