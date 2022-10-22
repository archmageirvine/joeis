package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A239460 Concatenation of n^2 and n^3.
 * @author Georg Fischer
 */
public class A239460 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return new Z(n.square().toString() + n.pow(3).toString());
  }
}
