package irvine.oeis.a247;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a000.A000203;
import irvine.oeis.a076.A076274;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A247787 Sum of divisors of 2*prime(n)-1.
 * @author Georg Fischer
 */
public class A247787 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A247787() {
    super(1, new A000203(), new A076274().skip(1));
  }
}
