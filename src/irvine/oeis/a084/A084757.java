package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000522;

/**
 * A084757 For n, k &gt; 0, let T(n, k) be given by T(n, 1) = n and T(n, k+1) = k*T(n, k) + 1. a(n) is the sum of the n-th antidiagonal.
 * @author Sean A. Irvine
 */
public class A084757 extends Sequence1 {

  private final DirectSequence mA = new A000522();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> mA.a(mN - k).add(Functions.FACTORIAL.z(mN - k).multiply(k - 1)));
  }
}
