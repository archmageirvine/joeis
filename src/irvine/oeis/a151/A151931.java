package irvine.oeis.a151;
// manually deris/diffseq at 2022-04-28 12:39

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a071.A071049;

/**
 * A151931 First differences of A071049.
 * @author Georg Fischer
 */
public class A151931 extends PrependSequence {

  /** Construct the sequence. */
  public A151931() {
    super(new DifferenceSequence(new A071049()), 1);
  }
}
