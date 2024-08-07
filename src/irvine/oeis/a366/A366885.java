package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-07-02/sintrif at 2024-07-03 22:28

import irvine.oeis.DirectSequence;
import irvine.oeis.a163.A163511;
import irvine.oeis.a347.A347385;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A366885 Dedekind psi function applied to the odd part of n, permuted by A163511: a(n) = A347385(A163511(n)).
 * @author Georg Fischer
 */
public class A366885 extends SingleTransformSequence {

  private static final DirectSequence A347385 = new A347385();

  /** Construct the sequence. */
  public A366885() {
    super(0, (term, n) -> A347385.a(term), "", new A163511());
  }
}
