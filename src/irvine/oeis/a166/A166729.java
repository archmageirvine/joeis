package irvine.oeis.a166;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A166729 Positive integers with English names ending in "t".
 * @author Georg Fischer
 */
public class A166729 extends Sequence1 {

  protected long mK;

  /** Construct the sequence. */
  public A166729() {
    mK = -2;
  }

  @Override
  public Z next() {
    mK += 10;
    while (mK % 100 == 18) {
      mK += 10;
    }
    return Z.valueOf(mK);
  }
}
