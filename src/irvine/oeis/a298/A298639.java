package irvine.oeis.a298;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A298639 Numbers k such that the digital sum of k and the digital root of k have the same parity. 
 * @author Georg Fischer
 */
public class A298639 extends Sequence1 {

  protected long mN;

  /** Construct the sequence. */
  public A298639() {
    mN = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.DIGIT_SUM.l(mN) % 2 == Functions.DIGIT_SUM_ROOT.l(mN) % 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
