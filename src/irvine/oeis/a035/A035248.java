package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035248 Indices of nonzero terms in expansion of Dirichlet series Product_p (1-(Kronecker(m,p)+1)*p^(-s)+Kronecker(m,p)*p^(-2s))^(-1) for m= -7 (A035182).
 * @author Sean A. Irvine
 */
public class A035248 extends A035182 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

