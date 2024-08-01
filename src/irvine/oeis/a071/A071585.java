package irvine.oeis.a071;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;

/**
 * A071585 Numerator of the continued fraction expansion whose terms are the first-order differences of exponents in the binary representation of 4*n, with the exponents of 2 being listed in descending order.
 * @author Sean A. Irvine
 */
public class A071585 extends CachedSequence {

  private static BiFunction<DirectSequence, Integer, Z> create() {
    return new BiFunction<>() {
      private int mP = 1;
      private int mK = -1;

      @Override
      public Z apply(final DirectSequence self, final Integer n) {
        // WARNING: This implementation does not really support random access
        if (n <= 1) {
          return n == 0 ? Z.ONE : Z.TWO;
        }
        if (++mK >= 2 * mP) {
          mP *= 2;
          mK = 0;
        }
        return self.a(mK).add(mK < mP ? self.a(mK + mP) : self.a(mK - mP));
      }
    };
  }

  /** Construct the sequence. */
  public A071585() {
    super(0, Integer.class, create());
  }
}

