package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046818 Number of 1's in binary expansion of 3n+1.
 * @author Sean A. Irvine
 */
public class A046818 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 3;
    return Z.valueOf(Long.bitCount(mN));
  }
}
