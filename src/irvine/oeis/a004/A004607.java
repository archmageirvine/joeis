package irvine.oeis.a004;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.factor.util.InfinitaryAliquotSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004607 Infinitary sociable numbers (smallest member of cycle).
 * @author Sean A. Irvine
 */
public class A004607 implements Sequence {

  // Note this sequence appears to list members without a proof that certain other
  // numbers are not members.  The complete chain for some numbers, the smallest
  // being 1152 seems to be unknown, so it cannot be ruled out that they are
  // members.  Here we use a limit of 20 steps.

  private static Z infinitaryDivisorSum(final Z n) {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z d : InfinitaryAliquotSequence.infinitaryDivisors(fs)) {
      sum = sum.add(d);
    }
    return sum.subtract(n);
  }

  private Z mN = Z.valueOf(1025);
  private final HashSet<Z> mAlreadyReported = new HashSet<>();
  {
    mAlreadyReported.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      //System.out.println("Trying: " + mN);
      Z n = mN;
      final HashSet<Z> seen = new HashSet<>();
      int m = 0;
      while (true) {
        seen.add(n);
        n = infinitaryDivisorSum(n);
        if (mAlreadyReported.contains(n)) {
          break;
        }
        if (seen.contains(n)) {
          if (seen.size() > 2 && mN.equals(n)) {
            mAlreadyReported.addAll(seen);
            return mN;
          } else {
            break;
          }
        }
        if (++m == 20) {
          // Aborting computation, number could be in sequence but seems unlikely
          break;
        }
      }
    }
  }
}

