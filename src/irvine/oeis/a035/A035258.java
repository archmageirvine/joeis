package irvine.oeis.a035;
// Generated by gen_seq4.pl diriproin at 2020-09-02 21:31
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035258 Positive integers of the form 2x^2+xy-2y^2 (discriminant 17).
 * @author Georg Fischer
 */
public class A035258 extends A035199 {

  /** Construct the sequence. */
  public A035258() {
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
