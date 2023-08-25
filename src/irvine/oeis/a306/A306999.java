package irvine.oeis.a306;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a003.A003594;
import irvine.oeis.a160.A160545;

/**
 * A306999 Numbers m such that 1 &lt; gcd(m, 21) &lt; m and m does not divide 21^e for e &gt;= 0.
 * @author Georg Fischer
 */
public class A306999 extends ComplementSequence {

  /** Construct the sequence. */
  public A306999() {
    super(1, new UnionSequence(1, new A003594(), new A160545()));
    super.next();
  }
}
