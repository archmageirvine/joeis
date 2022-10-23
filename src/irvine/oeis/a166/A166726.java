package irvine.oeis.a166;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A166726 Nonnegative integers with English names ending in "o".
 * @author Georg Fischer
 */
public class A166726 extends Sequence1 {

  protected long mK;

  /** Construct the sequence. */
  public A166726() {
    mK = 0;
  }

  @Override
  public Z next() {
    if (mK == 0) {
      mK = -8;
      return Z.ZERO;
    }
    mK += 10;
    while (mK % 100 == 12) {
      mK += 10;
    }
    return Z.valueOf(mK);
  }
}
