package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A025242 Generalized Catalan numbers A(x)^2 -(1+x)^2*A(x) +x*(2+x+x^2) =0.
 * @author Sean A. Irvine
 */
public class A025242 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z sum = a(n - 1);
    for (int k = 2; k < n; ++k) {
      sum = sum.add(a(k).multiply(a(n - 1 - k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (size() == 0) {
      add(Z.ONE);
      return Z.TWO;
    }
    return super.next();
  }
}
