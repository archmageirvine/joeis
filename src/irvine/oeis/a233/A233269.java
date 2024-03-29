package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-01-20/dirtraf at 2024-01-21 23:32

import irvine.oeis.a001.A001109;
import irvine.oeis.a055.A055881;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A233269 a(n) = A055881(A001109(n)).
 * @author Georg Fischer
 */
public class A233269 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A233269() {
    super(1, new A055881(), new A001109());
  }
}
