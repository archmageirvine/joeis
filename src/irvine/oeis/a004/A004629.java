package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004629 Squares written in base 11. (Next term contains a nondecimal digit.).
 * @author Sean A. Irvine
 */
public class A004629 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.square().toString(11));
  }
}

