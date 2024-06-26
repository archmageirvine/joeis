package irvine.oeis.a079;
// Generated by gen_seq4.pl 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.oeis.a101.A101296;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079617 Occurrences of prime factorization templates, unordered.
 * @author Georg Fischer
 */
public class A079617 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079617() {
    super(2, new A101296().skip(1), v -> v.subtract(1));
  }
}
