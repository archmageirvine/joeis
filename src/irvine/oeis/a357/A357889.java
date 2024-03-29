package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-03-14g/simtraf at 2024-03-14 21:15

import irvine.oeis.a022.A022010;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A357889 a(n) = (A022010(n) - 179)/210.
 * @author Georg Fischer
 */
public class A357889 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A357889() {
    super(1, new A022010(), v -> v.subtract(179).divide(210));
  }
}
