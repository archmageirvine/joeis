package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a187.A187272;

/**
 * A007055 Let S denote the palindromes in the language <code>{0,1}*; a(n) =</code> number of words of length n in the language SS.
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
    if (isEmpty()) {
      return Z.ONE;
    }
    final int n = size();
    for (final Z dd : Cheetah.factor(n).divisors()) {
      final int d = dd.intValueExact();
      if (d < n) {
        sum = sum.subtract(get(d).multiply(LongUtils.phi(n / d)));
      }
    }
    return sum;
  }
}
