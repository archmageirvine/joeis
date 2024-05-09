package irvine.oeis.a207;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;

/**
 * A207329 Number of distinct integers which can be represented as the product of factors of n, using each factor at most once.
 * @author Sean A. Irvine
 */
public class A207329 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DistinctMultiplicativeClosureSequence seq = new DistinctMultiplicativeClosureSequence(new FiniteSequence(Jaguar.factor(++mN).divisorsSorted()));
    long cnt = 0;
    while (seq.next() != null) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
