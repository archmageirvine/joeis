package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014050 <code>(n^2+1)^n</code>.
 * @author Sean A. Irvine
 */
public class A014050 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN * (long) mN + 1).pow(mN);
  }
}
