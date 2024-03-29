package irvine.oeis.a247;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a058.A058698;
import irvine.oeis.a070.A070804;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A247087 a(n) = pi(phi(p(P(n)))) = A000720(A000010(A000041(A000040(n)))).
 * @author Georg Fischer
 */
public class A247087 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A247087() {
    super(1, new A070804(), new A058698());
  }
}
