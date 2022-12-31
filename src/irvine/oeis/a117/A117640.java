package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A117640 Concatenation of first n numbers in base 4.
 * @author Georg Fischer
 */
public class A117640 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mSb = new StringBuilder();

  @Override
  public Z next() {
    mSb.append(Long.toString(++mN, 4));
    return new Z(mSb.toString());
  }
}
