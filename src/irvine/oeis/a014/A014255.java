package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014255.
 * @author Sean A. Irvine
 */
public class A014255 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().subtract(Z.valueOf(mN / 2).square());
  }
}
