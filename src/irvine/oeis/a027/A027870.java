package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027870 Number of zeros in 2^n.
 * @author Sean A. Irvine
 */
public class A027870 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(A027869.count(Z.ONE.shiftLeft(++mN)));
  }
}
