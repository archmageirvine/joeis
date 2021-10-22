package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A052109 a(1)=1, a(n)=a(n-a(1))+a(n-a(2))+a(n-a(3))+....a(n-a(n-1)) for n&gt;1, with convention that a(i)=0 for i&lt;=0.
 * @author Sean A. Irvine
 */
public class A052109 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    final Z zn = Z.valueOf(n);
    Z sum = Z.ZERO;
    for (int k = 1; k < n; ++k) {
      final Z t = zn.subtract(get(k));
      if (t.signum() > 0) {
        sum = sum.add(get(t.intValueExact()));
      }
    }
    return sum;
  }
}
