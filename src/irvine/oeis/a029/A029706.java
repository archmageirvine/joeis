package irvine.oeis.a029;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001861;

/**
 * A029706 Sum <code>C(n,k)*b(k), k=1..n</code>, where <code>b(k)</code> is given by <code>A001861</code>.
 * @author Sean A. Irvine
 */
public class A029706 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence a = new SkipSequence(new A001861(), 1);
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(a.next()));
    }
    return sum;
  }
}
