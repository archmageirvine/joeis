package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056009 a(n) = (n^n + 1)/ (n^(2^a) + 1), where 2^a is the highest power of 2 dividing n.
 * @author Sean A. Irvine
 */
public class A056009 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.pow(mN).add(1).divide(n.pow(1L << Long.numberOfTrailingZeros(mN)).add(1));
  }
}
