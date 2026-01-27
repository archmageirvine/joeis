package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083434 a(n) = smallest palindrome not included earlier and with the same prime signature as n, or 0 if no such palindrome exists.
 * @author Sean A. Irvine
 */
public class A083434 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
//    if (mN == 32) {
//      return Z.ZERO; // Strictly speaking this is a conjecture
//    }
    final Z sign = FactorUtils.leastPrimeSignature(Z.valueOf(mN));
    final Sequence palin = new A002113().skip();
    while (true) {
      final Z p = palin.next();
      final Z sig = FactorUtils.leastPrimeSignature(p);
      if (sign.equals(sig) && mSeen.add(p)) {
        return p;
      }
    }
  }
}
