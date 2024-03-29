package irvine.oeis.a088;
// Generated by gen_seq4.pl diffs/diffseq at 2023-09-23 21:26

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a051.A051674;

/**
 * A088385 a(n) = prime(n+1)^prime(n+1) - prime(n)^prime(n).
 * @author Georg Fischer
 */
public class A088385 extends DifferenceSequence {

  /** Construct the sequence. */
  public A088385() {
    super(1, new A051674());
  }
}
