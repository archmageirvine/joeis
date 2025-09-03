package irvine.oeis.a055;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A055225 a(n) = Sum_{k divides n} (n/k)^k.
 * @author Georg Fischer
 */
public class A055225 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Integers.SINGLETON.sumdiv(n, k -> n.divide(k).pow(k));
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.sumdiv(n, k -> Z.valueOf(n / k).pow(k));
  }

}
