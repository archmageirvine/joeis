package irvine.oeis.a330;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a007.A007775;
import irvine.oeis.a051.A051037;

/**
 * A330137 Numbers m such that 1 &lt; gcd(m, 30) &lt; m and m does not divide 30^e for e &gt;= 0.
 * @author Georg Fischer
 */
public class A330137 extends ComplementSequence {

  /** Construct the sequence. */
  public A330137() {
    super(1, new UnionSequence(new A007775(), new A051037()));
    super.next();
  }
}
