package irvine.oeis.a238;
// Generated by gen_seq4.pl 2024-03-26/dirtraf at 2024-03-26 23:22

import irvine.oeis.a000.A000045;
import irvine.oeis.a007.A007947;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A238684 a(1) = a(2) = 1; for n &gt; 2, a(n) is the product of prime factors of the n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A238684 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A238684() {
    super(1, new A007947(), new A000045());
  }
}
