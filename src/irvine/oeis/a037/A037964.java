package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037964 a(n) = binomial(4*n,2*n)/2 - (-1)^n*binomial(2*n,n)/2.
 * @author Sean A. Irvine
 */
public class A037964 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(4 * ++mN, 2 * mN).signedAdd((mN & 1) == 1, Binomial.binomial(2 * mN, mN)).divide2();
  }
}
