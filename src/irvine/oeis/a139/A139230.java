package irvine.oeis.a139;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000396;

/**
 * A139230 Second differences of perfect numbers A000396.
 * @author Georg Fischer
 */
public class A139230 extends DifferenceSequence {

  /** Construct the sequence. */
  public A139230() {
    super(1, new DifferenceSequence(new A000396()));
  }
}
