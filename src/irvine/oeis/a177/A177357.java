package irvine.oeis.a177;
// Generated by gen_seq4.pl 2024-06-23/sintraf at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a086.A086801;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A177357 Number of positive squares &lt;= prime(n) - 3.
 * @author Georg Fischer
 */
public class A177357 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A177357() {
    super(2, (term, n) -> Functions.SQRT.z(term), new A086801());
  }
}
