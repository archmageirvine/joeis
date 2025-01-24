package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074631 a(n) is the smallest k such that the sum of the first k terms of the composite-harmonic series, Sum_{j=1..k} 1/(j-th composite), is &gt; n.
 * @author Sean A. Irvine
 */
public class A074631 extends A002808 {

  private long mN = 0;
  private long mM = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    while (mSum.compareTo(n) <= 0) {
      mSum = mSum.add(new Q(Z.ONE, super.next()));
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
