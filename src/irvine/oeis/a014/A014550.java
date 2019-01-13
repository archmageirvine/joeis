package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014550.
 * @author Sean A. Irvine
 */
public class A014550 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return new Z(Long.toBinaryString(mN ^ (mN >>> 1)));
  }
}
