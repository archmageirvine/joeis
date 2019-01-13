package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006484.
 * @author Sean A. Irvine
 */
public class A006484 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).subtract(3).multiply(mN).add(5).multiply(mN + 1).multiply(mN).divide(6);
  }
}

