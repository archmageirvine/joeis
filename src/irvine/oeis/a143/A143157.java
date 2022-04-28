package irvine.oeis.a143;
// manually deris/partsum at 2022-04-28 12:39

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a091.A091512;

/**
 * A143157 Partial sums of A091512.
 * @author Georg Fischer
 */
public class A143157 extends PrependSequence {

  /** Construct the sequence. */
  public A143157() {
    super(new PartialSumSequence(new A091512()), 0);
  }
}
