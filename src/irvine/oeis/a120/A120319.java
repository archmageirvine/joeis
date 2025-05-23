package irvine.oeis.a120;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a016.A016945;

/**
 * A120319 RF(3): refactorable numbers with smallest prime factor 3.
 * @author Georg Fischer
 */
public class A120319 extends FilterSequence {

  /** Construct the sequence. */
  public A120319() {
    super(1, new A016945(), v -> v.mod(Functions.TAU.z(v)).isZero());
  }
}
