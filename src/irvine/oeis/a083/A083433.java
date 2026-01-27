package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083433 a(1) = 1; a palindrome is included in the sequence if it has a prime signature that is different from all previous terms.
 * @author Sean A. Irvine
 */
public class A083433 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Sequence mP = new A002113().skip();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP.next();
      final Z sig = FactorUtils.leastPrimeSignature(p);
      if (mSeen.add(sig)) {
        return p;
      }
    }
  }
}
