package irvine.oeis;

import java.util.function.BiFunction;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Base class for completely additive functions.
 * Derived from <em>MultiplicativeSequence</em>.
 * @author Georg Fischer
 */
public class AdditiveSequence extends MultiplicativeSequence implements DirectSequence {

  /**
   * Construct an additive sequence with the given function.
   * @param offset index of first term
   * @param step step between values of n
   * @param f function
   */
  public AdditiveSequence(final int offset, final long step, final BiFunction<Z, Integer, Z> f) {
    super(offset, step, f);
  }

  /**
   * Construct an additive sequence with the given function.
   * @param offset index of first term
   * @param f function
   */
  public AdditiveSequence(final int offset, final BiFunction<Z, Integer, Z> f) {
    super(offset, 1, f);
  }

  /**
   * Construct an additive sequence with the given function.
   * @param offset index of first term
   * @param fr recurrent function
   */
  public AdditiveSequence(final int offset, final TriFunction<MultiplicativeSequence, Z, Integer> fr) {
    super(offset, 1, fr);
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Z res = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      // System.out.println("n=" + n + ": f(" + p + ", " + fs.getExponent(p) + ") -> " + mLambda.apply(this, p, fs.getExponent(p)));
      res = res.add(mLambda.apply(this, p, fs.getExponent(p)));
    }
    return res;
  }
}
