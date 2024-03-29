package irvine.oeis.a340;
// Generated by gen_seq4.pl A335669/parmof5 at 2022-07-20 21:18

import irvine.oeis.a000.A000045;
import irvine.oeis.a339.A339130;
/**
 * A340235 Odd composite integers m such that A000045(3*m-J(m,5)) == 1 (mod m), where J(m,5) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A340235 extends A339130 {

  /** Construct the sequence. */
  public A340235() {
    super(1, new A000045(), 3, 5, 1);
  }
}
