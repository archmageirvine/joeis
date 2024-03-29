package irvine.oeis.a284;
// Generated by gen_seq4.pl dirtraf at 2024-02-06 22:08

import irvine.oeis.a000.A000005;
import irvine.oeis.a283.A283477;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A284005 a(0) = 1, and for n &gt; 1, a(n) = (1 + A000120(n))*a(floor(n/2)); also a(n) = A000005(A283477(n)).
 * @author Georg Fischer
 */
public class A284005 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A284005() {
    super(0, new A000005(), new A283477());
  }
}
