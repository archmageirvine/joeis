package irvine.oeis.a206;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A206786 Remainder of n^340 divided by 341.
 * @author Georg Fischer
 */
public class A206786 implements Sequence {

  protected int mN;

  /** Construct the sequence. */
  public A206786() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).modPow(Z.valueOf(340), Z.valueOf(341));
  }
}
