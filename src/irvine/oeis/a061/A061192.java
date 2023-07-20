package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A061192 a(1) = 1; a(n+1) = a(1) +(a(2) +(a(3) +...(a(n-1) +a(n)^2)^2...)^2)^2.
 * @author Sean A. Irvine
 */
public class A061192 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ONE;
    }
    Z t = Z.ZERO;
    for (int k = n - 1; k > 1; --k) {
      t = t.add(a(k)).square();
    }
    return t.add(1);
  }
}

