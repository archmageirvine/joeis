package irvine.oeis.a375;
// manually 2026-08-18/sintrif at 2026-08-18 15: 22

import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051903;
import irvine.oeis.a374.A374590;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A375848 The maximum exponent in the prime factorization of the numbers whose maximum exponent in their prime factorization is an evil number (A374590).
 * @author Georg Fischer
 */
public class A375848 extends PrependSequence {

  private static final DirectSequence A051903 = new A051903();

  /** Construct the sequence. */
  public A375848() {
    super(1, new SingleTransformSequence(1, (term, n) -> A051903.a(term), "", new A374590()), 0);
  }
}
