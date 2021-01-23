package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001539 a(n) = (4*n+1)*(4*n+3).
 * @author Sean A. Irvine
 */
public class A001539 implements Sequence {

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.valueOf(mN).multiply(mN + 2);
  }
}
