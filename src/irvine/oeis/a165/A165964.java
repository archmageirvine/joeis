package irvine.oeis.a165;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a095.A095816;

/**
 * A165964 Number of circular permutations of length n without increasing or decreasing 3-sequences.
 * @author Sean A. Irvine
 */
public class A165964 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A095816());
  private int mN = 0;

  private Z a(final int n) {
    return n < 0 ? Z.ZERO : mA.a(n);
  }

  @Override
  public Z next() {
    ++mN;
    return a(mN - 1)
      .subtract(Integers.SINGLETON.sum(1, (mN + 1) / 3, k -> a(mN - 3 * k).subtract(a(mN - 1 - 3 * k))).multiply2());
  }
}

