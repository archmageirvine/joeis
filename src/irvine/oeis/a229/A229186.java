package irvine.oeis.a229;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a031.A031297;

/**
 * A229186 Beginning position of n in the decimal expansion of the Champernowne constant.
 * @author Georg Fischer
 */
public class A229186 extends PrependSequence {

  /** Construct the sequence. */
  public A229186() {
    super(new A031297(), 11);
  }
}
