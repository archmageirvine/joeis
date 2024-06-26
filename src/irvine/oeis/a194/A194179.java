package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-05-11/parmof2 at 2024-05-11 21:20

import irvine.math.cr.CR;

/**
 * A194179 [sum{(k*r) : 1&lt;=k&lt;=n}], where [ ]=floor, ( )=fractional part, and r=1/2+sqrt(8).
 * @author Georg Fischer
 */
public class A194179 extends A194161 {

  /** Construct the sequence. */
  public A194179() {
    super(1, CR.HALF.add(CR.EIGHT.sqrt()));
  }
}
