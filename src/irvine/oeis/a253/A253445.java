package irvine.oeis.a253;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A253445 a(n) = concatenation of n^2 with itself.
 * @author Georg Fischer
 */
public class A253445 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    return new Z(n.square().toString() + n.square().toString());
  }
}
