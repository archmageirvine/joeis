package irvine.oeis.a135;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a016.A016027;

/**
 * A135701 First differences of indices of A000043.
 * @author Georg Fischer
 */
public class A135701 extends DifferenceSequence {

  /** Construct the sequence. */
  public A135701() {
    super(1, new A016027());
  }
}
