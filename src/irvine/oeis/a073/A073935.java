package irvine.oeis.a073;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060681;

/**
 * A073935 Numbers n such that the n-th row of triangle in A073932 contains the divisors of n.
 * @author Sean A. Irvine
 */
public class A073935 extends Sequence1 {

  private final DirectSequence mF = DirectSequence.create(new A060681());
  private int mN = 0;

  private boolean is(final Set<Integer> seen, final int n) {
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (!seen.remove(d.intValue())) {
        return false;
      }
    }
    return seen.isEmpty();
  }

  @Override
  public Z next() {
    while (true) {
      if (Integer.bitCount(++mN) == 1) {
        return Z.valueOf(mN);
      }
      int k = mN;
      final HashSet<Integer> seen = new HashSet<>();
      seen.add(k);
      do {
        k = mF.a(k).intValueExact();
        seen.add(k);
      } while (k > 1);
      if (is(seen, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

