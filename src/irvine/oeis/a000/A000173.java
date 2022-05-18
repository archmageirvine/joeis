package irvine.oeis.a000;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000173 Unitary-sociable numbers (smallest member of each cycle).
 * @author Sean A. Irvine
 */
public class A000173 implements Sequence {

  private long mN = 0;
  private final HashSet<Z> mAlreadyReported = new HashSet<>();
  {
    mAlreadyReported.add(Z.ZERO);
  }

  private Z unitaryDivisorSum(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.unitaryDivisorSum();
  }


  @Override
  public Z next() {
    while (true) {
      Z n = Z.valueOf(++mN);
      //System.out.println("mN=" + mN);
      final Z m = n;
      final HashSet<Z> seen = new HashSet<>();
      while (true) {
        seen.add(n);
        n = unitaryDivisorSum(n);
        if (mAlreadyReported.contains(n)) {
          break;
        }
        if (seen.contains(n)) {
          if (seen.size() > 2 && m.equals(n)) {
            mAlreadyReported.addAll(seen);
            return m;
          } else {
            break;
          }
        }
      }
    }
  }
}
