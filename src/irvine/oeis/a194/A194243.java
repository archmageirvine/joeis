package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-05-11/parmof2 at 2024-05-11 21:20

import irvine.math.cr.CR;

/**
 * A194243 [sum{(rk) : 1&lt;=k&lt;=n}], where [ ]=floor, ( )=fractional part, and r=2-sqrt(2).
 * @author Georg Fischer
 */
public class A194243 extends A194161 {

  /** Construct the sequence. */
  public A194243() {
    super(1, CR.TWO.subtract(CR.TWO.sqrt()));
  }
}
