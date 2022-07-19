package irvine.oeis;

import java.util.function.BiFunction;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Base class for (multiplicative) arithmetic functions.
 * @author Sean A. Irvine
 */
public class MultiplicativeSequence implements SequenceWithOffset {

  private final BiFunction<Z, Integer, Z> mF;
  private final int mOffset;
  private final long mStep;
  protected long mN;

  /**
   * Construct a multiplicative sequence with the given function.
   * @param offset index of first term
   * @param step step between values of n
   * @param f function
   */
  public MultiplicativeSequence(final int offset, final long step, final BiFunction<Z, Integer, Z> f) {
    mOffset = offset;
    mStep = step;
    mN = mOffset - 1;
    mF = f;
  }

  /**
   * Construct a multiplicative sequence with the given function.
   * @param offset index of first term
   * @param f function
   */
  public MultiplicativeSequence(final int offset, final BiFunction<Z, Integer, Z> f) {
    this(offset, 1, f);
  }

  @Override
  public Z next() {
    mN += mStep;
    final FactorSequence fs = Jaguar.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mF.apply(p, fs.getExponent(p)));
    }
    return prod;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }
}
