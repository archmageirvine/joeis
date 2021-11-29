package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048674 Fixed points of A048673 and A064216: Numbers n such that if n = product_{k &gt;= 1} (p_k)^(c_k), then Product_{k &gt;= 1} (p_{k+1})^(c_k) = (2*n)-1, where p_k indicates the k-th prime, A000040(k).
 * @author Sean A. Irvine
 */
public class A048674 extends A048673 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().longValueExact() == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

