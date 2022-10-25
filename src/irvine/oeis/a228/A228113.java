package irvine.oeis.a228;
// manually deris/diffseq at 2022-10-25 23:17

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057793;

/**
 * A228113 First differences of A057793.
 * @author Georg Fischer
 */
public class A228113 extends DifferenceSequence {

  /** Construct the sequence. */
  public A228113() {
    super(new PrependSequence(0, new A057793(), 0));
  }
}
