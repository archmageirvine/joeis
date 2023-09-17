package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065801 Least k such that n^k &gt; 2^n.
 * @author Sean A. Irvine
 */
public class A065801 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z s = Z.ONE.shiftLeft(++mN);
    Z k = CR.valueOf(s).log().divide(CR.valueOf(mN).log()).floor();
    final Z n = Z.valueOf(mN);
    while (n.pow(k).compareTo(s) <= 0) {
      k = k.add(1);
    }
    return k;
  }
}
