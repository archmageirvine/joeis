package irvine.oeis.a066;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006577;

/**
 * A066902.
 * @author Sean A. Irvine
 */
public class A066906 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A066906() {
    super(1, new A006577(), PRIME);
  }
}
