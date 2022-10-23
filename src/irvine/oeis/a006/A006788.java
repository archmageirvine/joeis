package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006788 a(n) = floor(2^(n-1)/n).
 * @author Sean A. Irvine
 */
public class A006788 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++).divide(mN);
  }
}
