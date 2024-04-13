package irvine.oeis.a117;
// manually 2021-01-20

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A117601 Padovan numbers which are divisible by the sum of their digits.
 * @author Georg Fischer
 */
public class A117601 extends A000931 {

  protected int mN;

  /** Construct the sequence. */
  public A117601() {
    super(1);
    mN = 0;
    for (int n = 0; n <= 12; ++n) { // skip leading terms with duplicates
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 5) {
      return Z.valueOf(mN); // fixed terms
    }
    Z result = super.next();
    while (! result.remainder(Functions.DIGIT_SUM.z(result)).equals(Z.ZERO)) {
      result = super.next();
    }
    return result;
  }
}
