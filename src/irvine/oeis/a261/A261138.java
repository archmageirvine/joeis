package irvine.oeis.a261;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A261138 The concatenation of 123456...n and the reverse of this number.
 * @author Georg Fischer
 */
public class A261138 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mSb = new StringBuilder("");

  /** Construct the sequence. */
  public A261138() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    mSb.append(String.valueOf(mN));
    final Z result = new Z(mSb.toString() + mSb.reverse());
    mSb.reverse();
    return result;
  }
}
