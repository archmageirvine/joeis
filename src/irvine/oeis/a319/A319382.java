package irvine.oeis.a319;
// Generated by gen_seq4.pl 2023-10-27/tuptraf at 2023-10-28 00:14

import irvine.math.z.Binomial;
import irvine.oeis.a022.A022911;
import irvine.oeis.a022.A022912;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A319382 Binomial coefficients binomial(m,k) for 2 &lt;= k &lt;= m/2 in sorted order.
 * @author Georg Fischer
 */
public class A319382 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A319382() {
    super(1, (n, s) -> Binomial.binomial(s[0], s[1]), "", new A022911(), new A022912());
  }
}
