package irvine.oeis.a338;
// Generated by gen_seq4.pl A335669/parmof4 at 2022-07-20 21:18

import irvine.oeis.a004.A004254;
import irvine.oeis.a335.A335669;

/**
 * A338009 Odd composite integers m such that A004254(m)^2 == 1 (mod m).
 * @author Georg Fischer
 */
public class A338009 extends A335669 {

  /** Construct the sequence. */
  public A338009() {
    super(1, new A004254(), 2, 1);
  }
}
