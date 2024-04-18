package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a187.A187272;
import irvine.oeis.memory.MemorySequence;

/**
 * A007055 Let S denote the palindromes in the language {0,1}*; a(n) = number of words of length n in the language SS.
 * @author Sean A. Irvine
 */
public class A007055 extends MemorySequence {

  protected Sequence r() {
    return new A187272();
  }

  final Sequence mS = r();

  @Override
  protected Z computeNext() {
    Z sum = mS.next();
    if (size() == 0) {
      return Z.ONE;
    }
    final int n = size();
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValueExact();
      if (d < n) {
        sum = sum.subtract(a(d).multiply(Functions.PHI.l((long) (n / d))));
      }
    }
    return sum;
  }
}
