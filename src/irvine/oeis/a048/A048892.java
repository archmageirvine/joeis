package irvine.oeis.a048;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048892 Start of n consecutive integers with distinct number of divisors.
 * @author Sean A. Irvine
 */
public class A048892 implements Sequence {

  private int mN = 0;
  private long mM = 1;

  private int consecutiveDistinctDivisors(long n) {
    final HashSet<Z> div = new HashSet<>();
    while (div.add(Jaguar.factor(n).sigma0())) {
      ++n;
    }
    return div.size();
  }

  @Override
  public Z next() {
    ++mN;
    while (consecutiveDistinctDivisors(mM) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

