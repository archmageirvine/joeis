package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A085077 Fibonacci numbers with a prime signature that has not occurred earlier.
 * @author Sean A. Irvine
 */
public class A085077 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Sequence mT = new A000045().skip();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      if (mSeen.add(FactorUtils.leastPrimeSignature(t))) {
        return t;
      }
    }
  }
}

