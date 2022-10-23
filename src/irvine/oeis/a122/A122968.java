package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A122968 27th powers: a(n) = n^27.
 * @author Georg Fischer
 */
public class A122968 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(27);
  }
}
