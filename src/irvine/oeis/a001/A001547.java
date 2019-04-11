package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001547 <code>(7*n+1)*(7*n+2)*(7*n+4)</code>.
 * @author Sean A. Irvine
 */
public class A001547 implements Sequence {

  private long mN = -6;

  @Override
  public Z next() {
    mN += 7;
    return Z.valueOf(mN).multiply(mN + 1).multiply(mN + 3);
  }
}
