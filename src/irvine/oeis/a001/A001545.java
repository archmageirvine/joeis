package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001545 a(n) = (5n+1)*(5n+4).
 * @author Sean A. Irvine
 */
public class A001545 implements Sequence {

  private long mN = -4;

  @Override
  public Z next() {
    mN += 5;
    return Z.valueOf(mN).multiply(mN + 3);
  }
}
