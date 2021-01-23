package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000217;

/**
 * A034792 Lexicographically earliest sequence of pairwise coprime triangular numbers.
 * @author Sean A. Irvine
 */
public class A034792 extends MemorySequence {

  private Sequence mT = new SkipSequence(new A000217(), 1);

  private boolean isCoprime(final Z t) {
    for (final Z m : this) {
      if (!Z.ONE.equals(m.gcd(t))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    while (true) {
      final Z t = mT.next();
      if (isCoprime(t)) {
        return t;
      }
    }
  }
}
