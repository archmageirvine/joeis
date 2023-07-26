package irvine.oeis.a278;
// manually A069877/parmof3 at 2023-07-26 12:42

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002620;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278259 Least number with the prime signature of the n-th quarter-square, a(1) = 0.
 * @author Georg Fischer
 */
public class A278259 extends SimpleTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A278259() {
    super(1, new A002620().skip(2), FactorUtils::leastPrimeSignature);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : super.next();
  }

}

