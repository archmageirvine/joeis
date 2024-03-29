package irvine.oeis.a339;
// Generated by gen_seq4.pl A335669/parmof5 at 2022-07-20 21:18

import irvine.oeis.a087.A087130;
/**
 * A339127 Odd composite integers m such that A087130(m-J(m,29)) == 2*J(m,29) (mod m), where J(m,29) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A339127 extends A339125 {

  /** Construct the sequence. */
  public A339127() {
    super(1, new A087130(), 1, 29, 2);
  }
}
