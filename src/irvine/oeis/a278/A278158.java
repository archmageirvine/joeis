package irvine.oeis.a278;
// manually A069877/parmof3 at 2023-07-26 13:08

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.a051.A051258;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278158 Least number with the prime signature of the n-th Fibocyclotomic number, with a(6) = 0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A278158 extends SimpleTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A278158() {
    super(1, new A051258().skip(), FactorUtils::leastPrimeSignature);
  }

  @Override
  public Z next() {
    if (++mN == 6) {
      super.next();
      return Z.ZERO;
    } else {
      return super.next();
    }
  }
}

