package irvine.oeis.a069;
// Generated by gen_seq4.pl 2024-02-27/partsun at 2024-02-27 18:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a060.A060715;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A069879 Number of pairs {i,j} with i different from j; 1&lt;=i&lt;=n; 1&lt;= j &lt;=n such that i+j is a prime number.
 * @author Georg Fischer
 */
public class A069879 extends PartialSumSequence {

  /** Construct the sequence. */
  public A069879() {
    super(1, new SimpleTransformSequence(0, new A060715(), v -> v.multiply(2)));
  }
}
