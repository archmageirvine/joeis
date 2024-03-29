package irvine.oeis.a275;
// Generated by gen_seq4.pl 2023-09-10/filtpos at 2023-09-10 21:48

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a060.A060131;

/**
 * A275814 Positions of even terms in A060131; indices of permutations of an even order in tables A060117 &amp; A060118.
 * @author Georg Fischer
 */
public class A275814 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A275814() {
    super(1, 0, new A060131(), EVEN);
  }
}
