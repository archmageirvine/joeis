package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001006;

/**
 * A006531 Semiorders on n elements.
 * @author Sean A. Irvine
 */
public class A006531 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final Sequence a1006 = new A001006();
    Z f = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      f = f.multiply(k);
      sum = sum.add(Stirling.secondKind(mN, k).multiply(f).multiply(a1006.next()));
    }
    return sum;
  }
}
