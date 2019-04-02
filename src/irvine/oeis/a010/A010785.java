package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A010785 Repdigit numbers, or numbers with repeated digits.
 * @author Sean A. Irvine
 */
public class A010785 implements Sequence {

  private char mN = '/';
  private int mLength = 1;

  @Override
  public Z next() {
    if (++mN > '9') {
      ++mLength;
      mN = '1';
    }
    return new Z(StringUtils.rep(mN, mLength));
  }
}
