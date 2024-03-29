package irvine.oeis.a349;
// Generated by gen_seq4.pl diffs/diffseq at 2023-09-23 21:26

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a004.A004709;

/**
 * A349236 Gaps between cubefree numbers: a(n) = A004709(n+1) - A004709(n).
 * @author Georg Fischer
 */
public class A349236 extends DifferenceSequence {

  /** Construct the sequence. */
  public A349236() {
    super(1, new A004709());
  }
}
