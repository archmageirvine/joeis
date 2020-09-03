package irvine.oeis.a035;
// Generated by gen_seq4.pl diriproin at 2020-09-02 21:31
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035271 Indices of the nonzero terms in expansion of Dirichlet series Product_p (1-(Kronecker(m,p)+1)*p^(-s)+Kronecker(m,p)*p^(-2s))^(-1) for m= 47.
 * @author Georg Fischer
 */
public class A035271 extends A035229 {

  /** Construct the sequence. */
  public A035271() {
    mN = 0;
  }

  @Override
  public Z next() {
    Z term = super.next();
    while (term.equals(Z.ZERO)) {
      term = super.next();
    }
    return Z.valueOf(mN);
  }
}
