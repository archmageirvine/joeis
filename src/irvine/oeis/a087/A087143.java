package irvine.oeis.a087;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087143 Numbers n such that sum of digits of n is divisible by digital root of n. 
 * @author Georg Fischer
 */
public class A087143 extends Sequence1 {

  protected int mN;

  /** Construct the sequence. */
  public A087143() {
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.DIGIT_SUM.l(mN) % Functions.DIGIT_SUM_ROOT.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
