package irvine.oeis.a160;

import irvine.oeis.PrependSequence;
import irvine.oeis.a093.A093419;

/**
 * A160049 Denominator of the Harary number for the path graph P_n.
 * @author Georg Fischer
 */
public class A160049 extends PrependSequence {

  /** Construct the sequence. */
  public A160049() {
    super(1, new A093419(), 1);
  }
}
