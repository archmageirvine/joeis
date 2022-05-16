package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a023.A023900;

/**
 * A045653 Number of 2n-bead balanced binary strings, rotationally equivalent to reverse.
 * @author Sean A. Irvine
 */
public class A045653 implements Sequence {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A023900());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mC.a(mN / d - 1).multiply(d).multiply(Binomial.binomial(d & ~1, d / 2)));
    }
    return sum.multiply2();
  }
}
