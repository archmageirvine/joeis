package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000788 Total number of <code>1</code>'s in binary expansions of 0, ..., <code>n</code>.
 * @author Sean A. Irvine
 */
public class A000788 implements Sequence {

  private Z mS = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    long x = ++mN;
    mS = mS.add(Long.bitCount(x));
    return mS;
  }
}
