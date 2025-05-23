package irvine.oeis.a194;
// Generated by gen_seq4.pl 2025-02-24.ack/parmof3 at 2025-02-24 19:24

import irvine.math.cr.CR;
import irvine.math.q.Q;

/**
 * A194762 Number of k such that {k*2^(1/3)} &lt; {n*2^(1/3)}, where { } = fractional part.
 * @author Georg Fischer
 */
public class A194762 extends A194733 {

  /** Construct the sequence. */
  public A194762() {
    super(1, CR.TWO.pow(new Q(1, 3)), -1);
  }
}
