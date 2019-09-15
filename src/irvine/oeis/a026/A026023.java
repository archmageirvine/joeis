package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026023 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| = 1</code> for i <code>= 1,2,...,n</code> and <code>s(0) = 3</code>. Also <code>a(n) = Sum{T(n,k), k = 0,1,...,[ (n+3)/2 ]}</code>, where T is defined in <code>A026022</code>.
 * @author Sean A. Irvine
 */
public class A026023 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z a = Binomial.binomial((mN / 2) * 2 + 2, mN / 2);
    return (mN & 1) == 0 ? a : a.multiply2();
  }
}

