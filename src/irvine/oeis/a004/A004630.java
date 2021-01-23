package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004630 Squares written in base 12. (Next term contains a non-decimal character.).
 * @author Sean A. Irvine
 */
public class A004630 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.square().toString(12));
  }
}

