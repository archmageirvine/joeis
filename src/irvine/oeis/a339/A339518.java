package irvine.oeis.a339;
// Generated by gen_seq4.pl A335669/parmof5 at 2022-07-20 21:18

import irvine.oeis.a006.A006497;
/**
 * A339518 Odd composite integers m such that A006497(2*m-J(m,13)) == 3*J(m,13) (mod m), where J(m,13) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A339518 extends A339125 {

  /** Construct the sequence. */
  public A339518() {
    super(1, new A006497(), 2, 13, 3);
  }
}
