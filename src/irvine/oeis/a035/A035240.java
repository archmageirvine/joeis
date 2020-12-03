package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035240 Indices of nonzero terms in expansion of Dirichlet series Product_p (1-(Kronecker(m,p)+1)*p^(-s)+Kronecker(m,p)*p^(-2s))^(-1) for m= -23 (A035167).
 * @author Sean A. Irvine
 */
public class A035240 extends A035167 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

