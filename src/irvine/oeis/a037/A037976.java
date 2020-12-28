package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037976 C(4*n,2*n)/4-(-1)^n*C(2*n,n)/4+(1-(-1)^n)*C(2*n,n)^2/4.
 * @author Sean A. Irvine
 */
public class A037976 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z b = Binomial.binomial(2 * mN, mN);
    Z t = Binomial.binomial(4 * mN, 2 * mN).signedAdd((mN & 1) == 1, b);
    if ((mN & 1) == 1) {
     t = t.add(b.square().multiply2());
    }
    return t.divide(4);
  }
}
