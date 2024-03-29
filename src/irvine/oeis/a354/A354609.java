package irvine.oeis.a354;
// Generated by gen_seq4.pl 2023-08-29/filter at 2023-08-29 23:04

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002997;

/**
 * A354609 Carmichael numbers ending in 1.
 * @author Georg Fischer
 */
public class A354609 extends FilterSequence {

  /** Construct the sequence. */
  public A354609() {
    super(1, new A002997(), t -> t.mod(10) == 1);
  }
}
