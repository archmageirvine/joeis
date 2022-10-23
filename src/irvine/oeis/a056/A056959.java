package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056959 In repeated iterations of function m -&gt; m/2 if m even, m -&gt; 3m+1 if m odd, a(n) is maximum value achieved if starting from n.
 * @author Sean A. Irvine
 */
public class A056959 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> seq = new TreeSet<>();
    Z m = mN;
    while (seq.add(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
    }
    return seq.last();
  }
}
