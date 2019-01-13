package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A163102.
 * @author Sean A. Irvine
 */
public class A163102 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).square().multiply(mN + 1).multiply(mN + 1).divide2();
  }
}

