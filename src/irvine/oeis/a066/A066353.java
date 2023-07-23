package irvine.oeis.a066;
// manually partsum at 2023-05-03 22:39

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a032.A032378;

/**
 * A066353 1 + partial sums of A032378.
 * @author Georg Fischer
 */
public class A066353 extends PartialSumSequence {

  {
    setOffset(0);
  }

  /** Construct the sequence. */
  public A066353() {
    super(1, new PrependSequence(new A032378(), 1));
  }
}
