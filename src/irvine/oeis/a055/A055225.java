package irvine.oeis.a055;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055225 a(n) = Sum_{k divides n} (n/k)^k.
 * @author Georg Fischer
 */
public class A055225 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, k -> Z.valueOf(mN / k).pow(k));
  }
}
