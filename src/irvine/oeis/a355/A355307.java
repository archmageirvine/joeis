package irvine.oeis.a355;
// Generated by gen_seq4.pl 2023-08-29/filter at 2023-08-29 23:04

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002997;

/**
 * A355307 Carmichael numbers ending in 7.
 * @author Georg Fischer
 */
public class A355307 extends FilterSequence {

  /** Construct the sequence. */
  public A355307() {
    super(1, new A002997(), t -> t.mod(10) == 7);
  }
}
