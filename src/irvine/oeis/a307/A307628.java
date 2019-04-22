package irvine.oeis.a307;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a001.A001122;
import irvine.oeis.a019.A019358;

/**
 * A307628.
 * @author Sean A. Irvine
 */
public class A307628 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A307628() {
    super(new A001122(), new A019358());
  }
}
