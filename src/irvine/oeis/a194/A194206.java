package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-05-11/parmof2 at 2024-05-11 21:20

import irvine.math.cr.CR;

/**
 * A194206 a(n) = [Sum_{k=1..n} (k*Pi)], where [ ]=floor, ( )=fractional part.
 * @author Georg Fischer
 */
public class A194206 extends A194161 {

  /** Construct the sequence. */
  public A194206() {
    super(1, CR.PI);
  }
}
