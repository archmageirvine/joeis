package irvine.oeis.a064;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064702 Nonnegative numbers such that additive and multiplicative digital roots coincide. 
 * @author Georg Fischer
 */
public class A064702 extends Sequence1 {

  protected int mN;

  /** Construct the sequence. */
  public A064702() {
    mN = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.DIGIT_SUM_ROOT.l(mN) == Functions.DIGIT_PRODUCT_ROOT.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
