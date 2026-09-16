package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086571 a(1)=1, for n&gt;1: a(n) = smallest divisor of n occurring earlier at most once.
 * @author Sean A. Irvine
 */
public class A086571 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private final HashSet<Z> mTwice = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      if (mUsed.add(d) || mTwice.add(d)) {
        return d;
      }
    }
    throw new RuntimeException();
  }
}
