package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005614;

/**
 * A066744 a(n) = either 4a(n-1)+1 or 4a(n-1)+3 depending on corresponding term of A005614, +3 for 0, +1 for 1.
 * @author Sean A. Irvine
 */
public class A066744 extends Sequence1 {

  private final Sequence mB = new A005614();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(4).add(mB.next().isZero() ? 3 : 1);
    return mA;
  }
}

