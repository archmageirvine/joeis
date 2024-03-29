package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a023.A023900;
import irvine.oeis.memory.MemorySequence;

/**
 * A045655 Number of 2n-bead balanced binary strings, rotationally equivalent to reversed complement.
 * @author Sean A. Irvine
 */
public class A045655 extends Sequence0 {

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
      sum = sum.add(mC.a(mN / d - 1).multiply(d).shiftLeft(d));
    }
    return sum;
  }
}
