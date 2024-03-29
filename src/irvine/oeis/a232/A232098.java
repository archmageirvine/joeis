package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-01-20/dirtraf at 2024-01-21 23:32

import irvine.oeis.a000.A000290;
import irvine.oeis.a055.A055881;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A232098 a(n) is the largest m such that m! divides n^2; a(n) = A055881(n^2).
 * @author Georg Fischer
 */
public class A232098 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A232098() {
    super(1, new A055881(), new A000290());
  }
}
