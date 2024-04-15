package irvine.oeis.a064;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064700 Numbers k that are divisible by the multiplicative digital root of k. 
 * @author Georg Fischer
 */
public class A064700 extends Sequence1 {

  protected long mN;

  /** Construct the sequence. */
  public A064700() {
    mN = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long root = Functions.DIGIT_PRODUCT_ROOT.l(mN);
      if (root != 0 && mN % root == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
