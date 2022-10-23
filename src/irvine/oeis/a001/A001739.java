package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001739 Squares written in base 4.
 * @author Sean A. Irvine
 */
public class A001739 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).square().toString(4));
  }

}
