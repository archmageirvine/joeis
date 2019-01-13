package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001546.
 * @author Sean A. Irvine
 */
public class A001546 implements Sequence {

  private long mN = -7;

  @Override
  public Z next() {
    mN += 8;
    return Z.valueOf(mN).multiply(mN + 2).multiply(mN + 4).multiply(mN + 6);
  }
}
