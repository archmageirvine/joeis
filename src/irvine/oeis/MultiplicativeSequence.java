package irvine.oeis;

import java.util.function.BiFunction;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Base class for (multiplicative) arithmetic functions.
 * @author Sean A. Irvine
 */
public class MultiplicativeSequence implements Sequence {

  private final BiFunction<Z, Integer, Z> mF;
  private long mN = 0;

  /**
   * Construct a multiplicative sequence with the given function.
   * @param f function
   */
  public MultiplicativeSequence(final BiFunction<Z, Integer, Z> f) {
    mF = f;
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mF.apply(p, fs.getExponent(p)));
    }
    return prod;
  }
}
