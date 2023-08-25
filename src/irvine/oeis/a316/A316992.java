package irvine.oeis.a316;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a003.A003593;
import irvine.oeis.a229.A229829;

/**
 * A316992 Numbers m such that 1 &lt; gcd(m, 15) &lt; m and m does not divide 15^e for e &gt;= 0.
 * @author Georg Fischer
 */
public class A316992 extends ComplementSequence {

  /** Construct the sequence. */
  public A316992() {
    super(1, new UnionSequence(new A003593(), new A229829()));
    super.next();
  }
}
