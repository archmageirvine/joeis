package irvine.oeis.a280;
// Generated by gen_seq4.pl 2024-05-08/parmof2 at 2024-05-08 21:31

import irvine.oeis.a000.A000037;
import irvine.oeis.a076.A076739;

/**
 * A280240 Expansion of 1/(1 - Sum_{k&gt;=1} x^(k+floor(1/2+sqrt(k)))).
 * @author Georg Fischer
 */
public class A280240 extends A076739 {

  /** Construct the sequence. */
  public A280240() {
    super(0, new A000037());
  }
}
