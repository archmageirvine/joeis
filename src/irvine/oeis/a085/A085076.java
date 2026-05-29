package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A085076 Triangular numbers &gt; 0 with a prime signature that has not occurred earlier.
 * @author Sean A. Irvine
 */
public class A085076 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Sequence mT = new A000217().skip();

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

