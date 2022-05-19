package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056957 In repeated iterations of function m-&gt;m/2 if m even, m-&gt;3m-1 if m odd, a(n) is minimum value achieved if starting from n.
 * @author Sean A. Irvine
 */
public class A056957 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final TreeSet<Z> seq = new TreeSet<>();
    Z m = mN;
    while (seq.add(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).subtract(1);
    }
    return seq.first();
  }
}
