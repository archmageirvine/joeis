package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036966 3-full (or cube-full, or cubefull) numbers: if a prime p divides n then so does p^3.
 * @author Sean A. Irvine
 */
public class A036966 extends Sequence1 {

  private final int mMinExponent;
  private long mN = 0;

  protected A036966(final int minExponent) {
    mMinExponent = minExponent;
  }

  /** Construct the sequence. */
  public A036966() {
    this(3);
  }

  private boolean is(final long n) {
    if (n == 1) {
      return true;
    }
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) < mMinExponent) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
