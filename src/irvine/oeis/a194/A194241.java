package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-05-11/parmof2 at 2024-05-11 21:20

import irvine.math.cr.CR;

/**
 * A194241 [sum{(rk) : 1&lt;=k&lt;=n}], where [ ]=floor, ( )=fractional part, and r=(1+sqrt(3))/2.
 * @author Georg Fischer
 */
public class A194241 extends A194161 {

  /** Construct the sequence. */
  public A194241() {
    super(1, CR.THREE.sqrt().add(1).divide(2));
  }
}
