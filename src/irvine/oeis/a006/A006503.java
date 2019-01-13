package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006503.
 * @author Sean A. Irvine
 */
public class A006503 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 1).multiply(mN + 8).divide(6);
  }
}

