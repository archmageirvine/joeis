package irvine.oeis.a064;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064807 Numbers which are divisible by their digital root (A010888). 
 * @author Georg Fischer
 */
public class A064807 extends Sequence1 {

  protected long mN;

  /** Construct the sequence. */
  public A064807() {
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN % Functions.DIGIT_SUM_ROOT.l(mN) == 0L) {
        return Z.valueOf(mN);
      }
    }
  }
}
