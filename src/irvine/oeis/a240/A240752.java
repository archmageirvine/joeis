package irvine.oeis.a240;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a004.A004159;

/**
 * A240752 First differences of digit sums of squares, cf. A004159.
 * @author Georg Fischer
 */
public class A240752 extends DifferenceSequence {

  /** Construct the sequence. */
  public A240752() {
    super(1, new A004159());
  }
}
