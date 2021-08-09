package irvine.oeis.a166;
// manually 2021-08-08

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A166727 Positive integers with English names ending in &quot;r&quot;. 
 * @author Georg Fischer
 */
public class A166727 implements Sequence {

  protected long mK;

  /** Construct the sequence. */
  public A166727() {
    mK = -6;
  }

  @Override
  public Z next() {
    mK += 10;
    while (mK % 100 == 14) {
      mK += 10;
    }
    return Z.valueOf(mK);
  }
}
