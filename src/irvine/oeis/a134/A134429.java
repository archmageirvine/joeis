package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A134429 a(n) = (-1)^(1 + n) * 2 * ( -1/2 -n + (-1)^((1 + n)*(2 + n)/2)).
 * @author Georg Fischer
 */
public class A134429 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.NEG_ONE.pow(mN + 1).multiply(Z.NEG_ONE
      .subtract(2 * mN).add(Z.NEG_ONE.pow((mN + 1) * (mN + 2) / 2).multiply2()));
  }
}
