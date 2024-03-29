package irvine.oeis.a265;
// Generated by gen_seq4.pl dirtraf at 2024-02-06 22:08

import irvine.oeis.a263.A263272;
import irvine.oeis.a263.A263273;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A265351 Permutation of nonnegative integers: a(n) = A263272(A263273(n)).
 * @author Georg Fischer
 */
public class A265351 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A265351() {
    super(0, new A263272(), new A263273());
  }
}
