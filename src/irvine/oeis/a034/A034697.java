package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034697 a(1)=1, a(n)= 1 + Sum a(p), p prime, p | n-1.
 * @author Sean A. Irvine
 */
public class A034697 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z sum = Z.ONE;
    for (final Z p : Jaguar.factor(size()).toZArray()) {
      sum = sum.add(get(p.intValue() - 1));
    }
    return sum;
  }
}

