package irvine.oeis.a151;
// manually deris/diffseq at 2022-04-28 12:39

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a070.A070952;

/**
 * A151929 First differences of A070952.
 * @author Georg Fischer
 */
public class A151929 extends PrependSequence {

  /** Construct the sequence. */
  public A151929() {
    super(new DifferenceSequence(new A070952()), 1);
  }
}
