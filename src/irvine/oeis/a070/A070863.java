package irvine.oeis.a070;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A070863 Sum of numbers in n-th row of A070861.
 * @author Sean A. Irvine
 */
public class A070863 extends Sequence0 {

  private final List<Z> mA = new ArrayList<>();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mA.add(Z.valueOf(mN));
    final DistinctMultiplicativeClosureSequence closure = new DistinctMultiplicativeClosureSequence(new FiniteSequence(mA));
    Z sum = Z.ZERO;
    while (true) {
      final Z t = closure.next();
      if (t == null) {
        return sum;
      }
      sum = sum.add(t);
    }
  }
}
