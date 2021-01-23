package irvine.oeis.a028;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a007.A007952;

/**
 * A028913 First differences of A007952.
 * @author Sean A. Irvine
 */
public class A028913 extends DifferenceSequence {

  /** Construct the sequence. */
  public A028913() {
    super(new A007952());
  }
}
