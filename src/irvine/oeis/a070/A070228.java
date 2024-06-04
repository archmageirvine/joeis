package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070224.
 * @author Sean A. Irvine
 */
public class A070228 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    return Z.ONE.subtract(Integers.SINGLETON.sum(2, mN, k -> Functions.MOBIUS.z(k).multiply(t.root(k).subtract(1))));
  }
}

