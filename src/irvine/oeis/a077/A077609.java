package irvine.oeis.a077;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.InfinitaryAliquotSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077609 Triangle in which n-th row lists infinitary divisors of n.
 * @author Sean A. Irvine
 */
public class A077609 extends Sequence1 {

  private long mN = 0;
  final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.addAll(InfinitaryAliquotSequence.infinitaryDivisors(Jaguar.factor(++mN)));
    }
    return mA.pollFirst();
  }
}
