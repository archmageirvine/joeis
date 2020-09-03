package irvine.oeis.a035;
// Generated by gen_seq4.pl diriproin at 2020-09-02 21:31
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035257 Indices of the nonzero terms in expansion of Dirichlet series Product_p (1-(Kronecker(m,p)+1)*p^(-s)+Kronecker(m,p)*p^(-2s))^(-1) for m= 14.
 * @author Georg Fischer
 */
public class A035257 extends A035196 {

  /** Construct the sequence. */
  public A035257() {
    mN = 1 - 1;
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
