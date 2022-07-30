package irvine.oeis.a209;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A209198 a(n) = 1 if n not == 2 (mod 4) and relatively prime to 63 otherwise 0.
 * @author Georg Fischer
 */
public class A209198 implements SequenceWithOffset {

  private int mN;

  /** Construct the sequence. */
  public A209198() {
    mN = 0;
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    return mN % 4 != 2 && mN % 7 != 0 && mN % 9 != 0 ? Z.ONE : Z.ZERO;
  }
}
