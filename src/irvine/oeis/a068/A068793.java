package irvine.oeis.a068;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A068793 a(n) = Sum_{i=1..n} i*(n^(n-i-1) + n^(n+i-1)).
 * @author Georg Fischer
 */
public class A068793 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    // a(n)=(n^n*(n^n*(n-2)+2)-n^2+n-1)/(n-1)^2
    ++mN;
    final Z n = Z.valueOf(mN);
    final Z nn = n.pow(mN);
    return nn.multiply(nn.multiply(mN - 2).add(2)).add(-mN * mN + mN - 1).divide(mN * mN - 2 * mN + 1);
  }
}
