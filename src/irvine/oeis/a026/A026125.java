package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026125.
 * @author Sean A. Irvine
 */
public class A026125 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026125() {
    super(new PrependSequence(new A026110(), 0));
  }
}
