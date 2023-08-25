package irvine.oeis.a316;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a003.A003591;
import irvine.oeis.a162.A162699;

/**
 * A316991 Numbers m such that 1 &lt; gcd(m, 14) &lt; m and m does not divide 14^e for e &gt;= 0.
 * @author Georg Fischer
 */
public class A316991 extends ComplementSequence {

  /** Construct the sequence. */
  public A316991() {
    super(1, new UnionSequence(new A003591(), new A162699()));
    super.next();
  }
}
