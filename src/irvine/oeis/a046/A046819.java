package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046819 Number of 1's in binary expansion of 3n+2.
 * @author Sean A. Irvine
 */
public class A046819 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 3;
    return Z.valueOf(Long.bitCount(mN));
  }
}
