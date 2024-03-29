package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-01-20/diffs at 2024-01-21 23:32

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a060.A060833;

/**
 * A106836 First differences of A060833 and (from a(2) onward) also of A091067 and A255068.
 * @author Georg Fischer
 */
public class A106836 extends DifferenceSequence {

  /** Construct the sequence. */
  public A106836() {
    super(1, new A060833());
  }
}
