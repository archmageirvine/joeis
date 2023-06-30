package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A065447 Concatenation of 1, 00, 111, 0000, ..., n 1&apos;s (if n is odd) or n 0&apos;s (if n is even).
 * @author Georg Fischer
 */
public class A065447 extends Sequence1 {

  private int mN = 0;
  private StringBuffer mA = new StringBuffer();

  @Override
  public Z next() {
    ++mN;
    mA.append(StringUtils.rep(((mN & 1) == 0) ? '0' : '1', mN));
    return new Z(mA.toString());
  }
}
