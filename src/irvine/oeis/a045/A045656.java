package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a023.A023900;

/**
 * A045656 Number of 2n-bead balanced binary strings, rotationally equivalent to reverse, complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045656 implements Sequence {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A023900());
  private final MemorySequence mD = MemorySequence.cachedSequence(new A045674());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mC.a(mN / d - 1).multiply(d).multiply(mD.a(d)));
    }
    return sum.multiply2();
  }
}
