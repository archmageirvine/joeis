package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000788 Total number of 1's in binary expansions of 0, ..., n.
 * @author Sean A. Irvine
 */
public class A000788 implements Sequence {

  private Z mS = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mS = mS.add(Long.bitCount(++mN));
    return mS;
  }
}
