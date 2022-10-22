package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A239461 Concatenation of n^3 and n^2.
 * @author Georg Fischer
 */
public class A239461 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return new Z(n.pow(3).toString() + n.square().toString());
  }
}
