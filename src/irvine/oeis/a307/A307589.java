package irvine.oeis.a307;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a003.A003595;
import irvine.oeis.a235.A235933;

/**
 * A307589 Numbers m such that 1 &lt; gcd(m, 35) &lt; m and m does not divide 35^e for e &gt;= 0.
 * @author Georg Fischer
 */
public class A307589 extends ComplementSequence {

  /** Construct the sequence. */
  public A307589() {
    super(1, new UnionSequence(new A003595(), new A235933()));
    super.next();
  }
}
