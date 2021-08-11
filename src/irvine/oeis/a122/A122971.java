package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A122971 30th powers: a(n) = n^30.
 * @author Georg Fischer
 */
public class A122971 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(30);
  }
}
