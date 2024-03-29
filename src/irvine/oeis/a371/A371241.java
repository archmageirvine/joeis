package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-26/dirtraf at 2024-03-26 23:22

import irvine.oeis.a000.A000010;
import irvine.oeis.a032.A032924;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A371241 Euler totient function applied to the zeroless numbers in base 3 (A032924).
 * @author Georg Fischer
 */
public class A371241 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A371241() {
    super(1, new A000010(), new A032924());
  }
}
