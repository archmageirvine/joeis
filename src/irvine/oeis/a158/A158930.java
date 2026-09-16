package irvine.oeis.a158;
// manually 2026-09-14/mex

import java.util.function.Predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.recur.MexSequence;

/**
 * A158930 a(n) is the smallest integer not yet in the sequence with no common base-5 digit with a(n-1).
 * @author Georg Fischer
 */
public class A158930 extends MexSequence {

  /** Construct the sequence. */
  public A158930() {
    super(1, (self, n) -> self.mex(v -> (Functions.SYNDROME.i(5, self.a(n - 1)) & Functions.SYNDROME.i(5, v)) == 0), "1");
  }

  @Override
  public Z mex(final Predicate<Z> predicate) {
    Z candidate = super.mex();
    final int syn = Functions.SYNDROME.i(5, super.previous());
    if ((syn & 1) == 1 && Integer.bitCount(syn) == 4) {
      // a mixture of 0 and 3 distinct digits, e.g. 1034 -> sequences of the missing digit 2222, 22222, 222222 ...
      final long missing = Functions.VALUATION.l(syn ^ 0b11111, 2);
      candidate = Z.valueOf(missing);
      while (true) {
        if (!contains(candidate) && (syn & Functions.SYNDROME.i(5, candidate)) == 0) {
          return candidate;
        }
        candidate = candidate.multiply(5).add(missing);
      }
    }
    while (true) {
      if (!contains(candidate) && predicate.test(candidate)) {
        return candidate;
      }
      candidate = candidate.add(1);
    }
  }

}
