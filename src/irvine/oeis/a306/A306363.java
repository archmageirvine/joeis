package irvine.oeis.a306;
// Generated by gen_seq4.pl 2024-07-13/sintrif at 2024-07-13 23:12

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000522;
import irvine.oeis.a066.A066504;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A306363 For n &gt; 1 having omega(n) = k and canonical prime factorization n = d_1*d_2*...*d_k, a(n) = Sum_{i=1..k} (d_i*a(n/d_i) + (n/d_i)); a(1)=0.
 * @author Georg Fischer
 */
public class A306363 extends SingleTransformSequence {

  private static final DirectSequence A000522 = new A000522();

  /** Construct the sequence. */
  public A306363() {
    super(1, (term, n) -> A000522.a(Functions.OMEGA.i(n) - 1).multiply(term), "", new A066504());
  }
}
