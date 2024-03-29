package irvine.oeis.a079;
// Generated by gen_seq4.pl 2023-12-27/tuptraf at 2023-12-27 11:35

import irvine.oeis.a000.A000010;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A079895 a(1) = 1; a(n) = phi(n) - phi(n-1)* a(n-1) if n &gt; 1.
 * @author Georg Fischer
 */
public class A079895 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A079895() {
    super(1, (n, s) -> s[1].subtract(s[2].multiply(s[0])), "1", PREVIOUS, new A000010(), PREVIOUS);
  }
}
