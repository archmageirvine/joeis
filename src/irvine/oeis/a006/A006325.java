package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006325.
 * @author Sean A. Irvine
 */
public class A006325 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(1).multiply(mN).add(1).multiply(mN - 1).multiply(mN).divide(6);
  }
}

