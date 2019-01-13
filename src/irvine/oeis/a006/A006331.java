package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006331.
 * @author Sean A. Irvine
 */
public class A006331 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(2 * mN + 1).multiply(mN).multiply(mN + 1).divide(3);
  }
}

