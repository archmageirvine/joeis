package irvine.oeis.a340;
// Generated by gen_seq4.pl A335669/parmof5 at 2022-07-20 21:18

import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054413;
import irvine.oeis.a339.A339130;
/**
 * A340096 Odd composite integers m such that A054413(m-J(m,53)) == 0 (mod m), where J(m,53) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A340096 extends A339130 {

  /** Construct the sequence. */
  public A340096() {
    super(1, new PrependSequence(new A054413(), 0), 1, 53, 0);
  }
}
