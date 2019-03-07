package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019303.
 * @author Sean A. Irvine
 */
public class A019303 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((++mN & 1) == 0 ? 1 : mN / 2 + 4);
  }
}

