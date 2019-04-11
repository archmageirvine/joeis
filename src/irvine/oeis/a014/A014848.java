package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014848 <code>n^2 - floor( n/2 )</code>.
 * @author Sean A. Irvine
 */
public class A014848 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().subtract(mN / 2);
  }
}
