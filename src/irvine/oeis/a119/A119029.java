package irvine.oeis.a119;
// Generated by gen_seq4.pl 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.oeis.a120.A120267;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A119029 Numerator of Sum_{k=1..n} n^(k-1)/k!.
 * @author Georg Fischer
 */
public class A119029 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A119029() {
    super(1, new A120267(), (n, v) -> v.divide(n));
  }
}
